public void sendException(java.lang.Throwable t) {
    t.printStackTrace();
    org.animotron.exception.AnimoException ae;
    if (t instanceof org.animotron.exception.AnimoException) {
        ae = ((org.animotron.exception.AnimoException) (t));
        ae.addToStack(getOP());
    }else {
        ae = new org.animotron.exception.AnimoException(getOP(), t);
    }
    stopChannel().publish(ae);
    done();
}
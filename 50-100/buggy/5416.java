public boolean accountAction(double amount) {
    try {
        java.lang.Integer i = 3;
        outToServer.writeObject(i);
        outToServer.writeObject(amount);
        boolean complete = ((boolean) (inFromServer.readObject()));
        return complete;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
    return false;
}
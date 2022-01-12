public java.lang.String recall() {
    java.lang.String msg;
    if ((recalls) == null) {
        recalls = iterator();
    }
    if (!(recalls.hasNext())) {
        emptyRecallHandler.update(null);
    }
    msg = recalls.next();
    recallHandler.update(msg);
    return msg;
}
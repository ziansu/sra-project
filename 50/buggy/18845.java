private boolean handleExcept(com.exascale.optimizer.NetworkReceiveOperator receive) throws java.lang.Exception {
    if ((receive.parent().children().size()) == 1) {
        pushAcross(receive);
        return true;
    }
    return false;
}
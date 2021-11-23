public java.lang.String debugMsg() {
    java.lang.String msg = ("Status of Base Station " + (this.id)) + " is shown below: \n ";
    for (int i = 1; i <= 10; i++) {
        msg += this.channels.get(i).debugMsg();
    }
    return msg;
}
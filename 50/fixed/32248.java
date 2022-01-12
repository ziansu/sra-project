public void wdgmsg(haven.Widget sender, java.lang.String msg, java.lang.Object... args) {
    if (sender == (cbtn)) {
        wdgmsg("close");
    }else {
        super.wdgmsg(sender, msg, args);
    }
}
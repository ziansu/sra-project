private java.lang.String getStatus() {
    java.lang.String strRet = "";
    if ((commandstatus.length()) != 0) {
        strRet = com.asksven.commandcenter.valueobjects.Command.exec(commandstatus, false);
    }
    return strRet;
}
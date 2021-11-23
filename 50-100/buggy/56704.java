private calendear.action.Task addWithInfo(calendear.action.CommandAdd cmd) {
    calendear.action.Task toReturn = new calendear.action.Task("");
    boolean[] infoList = cmd.getChecklist();
    java.lang.Object[] newData = cmd.getNewInfo();
    exchangeInfo(toReturn, infoList, newData);
    return toReturn;
}
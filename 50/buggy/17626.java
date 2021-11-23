@java.lang.Override
public void dataChanged(homecontrolclient.ServerEvent se) {
    if (se.getType().equals("STATUS_GARAGE_DOOR")) {
        java.lang.System.out.println(("dataChanged: doorJson = " + (se.getJson())));
        processDoorStatusUpdate(se.getJson());
    }
}
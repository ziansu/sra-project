@java.lang.Override
public void dataChanged(homecontrolclient.ServerEvent se) {
    if (se.getType().equals("STATUS_GARAGE_DOOR")) {
        processDoorStatusUpdate(se.getJson());
    }
}
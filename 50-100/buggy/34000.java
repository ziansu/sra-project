public void handleMessageFromServer(java.lang.Object msg) {
    java.util.HashMap<java.lang.String, java.lang.Object> packaged = ((java.util.HashMap<java.lang.String, java.lang.Object>) (msg));
    java.lang.String controllerID = ((java.lang.String) (packaged.get("controllerID")));
    application.QueryController cq = ((application.QueryController) (QueryController.controllerHashMap.get(controllerID)));
    cq.setPackaged(packaged);
    synchronized(this) {
        notify();
    }
}
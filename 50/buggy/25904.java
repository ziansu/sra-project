protected void finalize() {
    application.QueryController.controllerHashMap.put(controllerID, this);
    packaged.remove("controllerID");
}
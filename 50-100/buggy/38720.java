private void collectCameras(java.util.Map<java.lang.String, java.lang.Object> cameras) {
    java.util.ArrayList<java.lang.Long> cameraList = new java.util.ArrayList<>();
    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : cameras.entrySet()) {
        java.util.Map singleCamera = ((java.util.Map) (entry.getValue()));
        cameraList.add(((java.lang.Long) (singleCamera.get("status"))));
    }
}
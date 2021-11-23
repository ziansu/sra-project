public static void receivedFile(int device, java.lang.String path) {
    java.lang.String a = applicationLayer.FileService.getAppendix(path);
    if ((((a.equals("gif")) || (a.equals("png"))) || (a.equals("jpeg"))) || (a.equals("jpg"))) {
        controller.Controller.mainWindow.addMessage(device, path, Message.TYPE_IMAGE);
    }else {
        controller.Controller.mainWindow.addMessage(device, path, Message.TYPE_FILE);
    }
}
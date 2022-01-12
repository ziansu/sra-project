public void run() {
    while (running) {
        double oldFileSize = file.checkFileSize();
        if (oldFileSize != (fileSize)) {
            try {
                history.setText(file.read(AdvanceInterface.ChatWindow.FILE_NAME));
            } catch (java.io.FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    } 
}
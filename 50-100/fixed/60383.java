public void run() {
    while (running) {
        double oldFileSize = file.checkFileSize();
        if (oldFileSize != (fileSize)) {
            try {
                history.setText(file.read());
            } catch (java.io.FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    } 
}
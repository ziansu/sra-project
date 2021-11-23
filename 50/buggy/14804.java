public boolean fileExistance() {
    java.io.File file = new java.io.File(this.getFilesDir(), com.toddbray.blackjack.InvokeXML.FILE_NAME);
    return file.exists();
}
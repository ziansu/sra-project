private void findNext() {
    java.io.File file = null;
    if ((files) != null) {
        while ((file == null) || (file.isDirectory())) {
            if ((position) >= (files.length)) {
                file = null;
                break;
            }else {
                file = files[position];
                (position)++;
            }
        } 
    }
    next = file;
}
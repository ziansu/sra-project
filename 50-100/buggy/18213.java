@java.lang.Override
public void parseAllFiles(javafx.collections.ObservableList<java.io.File> files) {
    new java.lang.Thread(() -> {
        if ((files.size()) > 0) {
            for (java.io.File file : files) {
                parse(file);
            }
        }
    }).start();
}
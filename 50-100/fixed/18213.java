@java.lang.Override
public void parseAllFiles(javafx.collections.ObservableList<java.io.File> files) {
    if ((files.size()) > 0) {
        for (java.io.File file : files) {
            new java.lang.Thread(() -> parse(file)).start();
        }
    }
}
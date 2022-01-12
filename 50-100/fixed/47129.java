@java.lang.Override
public void run() {
    java.lang.String path = form.getFolder();
    java.io.File selectedFile = form.getSelectedFile();
    if (!(path.endsWith("/")))
        path = path + "/";
    
    if (!(path.startsWith("/"))) {
        path = path.substring(1);
    }
    path = path + (selectedFile.getName());
    uploadFile(path, selectedFile);
}
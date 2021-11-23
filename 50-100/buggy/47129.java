@java.lang.Override
public void run() {
    java.lang.String path = form.getFolder();
    java.io.File selectedFile = form.getSelectedFile();
    if (!(path.endsWith("/")))
        path = path + "/";
    
    uploadFile(path, selectedFile);
}
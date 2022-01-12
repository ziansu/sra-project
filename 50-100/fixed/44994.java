@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    if ((FXMLFile) == null)
        FXMLFile = "sample";
    
    java.io.File logoFile = new java.io.File("resources/Images/TeamHype-logo.png");
    if (logoFile.exists()) {
        img = new javafx.scene.image.Image(("file:" + (logoFile.getAbsolutePath())));
        if (FXMLFile.equals("sample")) {
            logo.setImage(img);
        }
    }else {
        java.lang.System.err.println("Logo File not found");
    }
}
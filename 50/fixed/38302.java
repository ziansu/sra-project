public void build(java.lang.String startScene, com.nebula2d.editor.util.ProjectBuilder.ProjectType type) throws java.io.IOException, java.lang.InterruptedException, net.lingala.zip4j.exception.ZipException {
    switch (type) {
        case PC :
            buildPC(startScene);
            break;
    }
}
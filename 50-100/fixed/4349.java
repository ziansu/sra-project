public void attach(java.lang.String s) {
    selector = s;
    if ((screen) != null) {
        org.springfield.fs.FsNode node = getControllerNode(selector);
        if (node != null) {
            nodepath = node.getProperty("nodepath");
            fields = node.getProperty("fields");
            model.observeTree(this, nodepath);
            loadHtml();
        }
    }
}
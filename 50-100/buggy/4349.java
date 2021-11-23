public void attach(java.lang.String s) {
    selector = s;
    if ((screen) != null) {
        org.springfield.fs.FsNode node = getControllerNode(selector);
        if (node != null) {
            nodepath = node.getProperty("nodepath");
            fields = node.getProperty("fields");
            template = node.getProperty("template");
            model.observeTree(this, nodepath);
            screen.get(selector).template(template);
            loadHtml();
        }
    }
}
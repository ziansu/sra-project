public static void main(java.lang.String[] args) {
    App1 app = new App1();
    app.cleanDb();
    Node root = app.createRootNode();
    app.exploreGraph(root);
    app.print(root, 0);
    app.print(root, 1);
    new ZipUtils("zip/myDb.zip");
}
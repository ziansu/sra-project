public void addOrUpdateFile(java.lang.String filename, java.lang.String name, java.lang.String checksum) {
    appdb.addOrUpdateFile(filename, name, checksum);
    if ((this.rootNode.getChild(filename)) == null) {
        com.matburt.mobileorg.Parsing.Node node = new com.matburt.mobileorg.Parsing.Node(filename, this.rootNode);
        node.parsed = false;
        rootNode.sortChildren();
    }
    if (filename.equals(OrgFile.CAPTURE_FILE)) {
        this.parser.parseFile(filename, rootNode);
        this.edits = this.parser.parseEdits();
    }
}
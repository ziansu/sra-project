public net.unicoen.node.UniClassDec parse() throws java.io.IOException {
    java.util.List<net.unicoen.node.UniNode> list = net.unicoen.parser.blockeditor.ToBlockEditorParser.parse(selectedFile);
    net.unicoen.node.UniClassDec dec = new net.unicoen.node.UniClassDec();
    dec.members = new java.util.ArrayList<net.unicoen.node.UniMemberDec>();
    dec.className = selectedFile.getName().substring(0, selectedFile.getName().indexOf(".xml"));
    for (net.unicoen.node.UniNode node : list) {
    }
    net.unicoen.parser.blockeditor.UniToBlockParser parser = new net.unicoen.parser.blockeditor.UniToBlockParser();
    parser.parse(dec);
    return dec;
}
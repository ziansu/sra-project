public net.unicoen.node.UniClassDec parse() throws java.io.IOException {
    net.unicoen.node.UniClassDec dec = net.unicoen.parser.blockeditor.ToBlockEditorParser.parse(selectedFile);
    dec.members = new java.util.ArrayList<net.unicoen.node.UniMemberDec>();
    dec.className = selectedFile.getName().substring(0, selectedFile.getName().indexOf(".xml"));
    net.unicoen.parser.blockeditor.UniToBlockParser parser = new net.unicoen.parser.blockeditor.UniToBlockParser();
    parser.parse(dec);
    return dec;
}
private void readContacts(org.w3c.dom.Node node) {
    if (node == null) {
        return ;
    }
    this.contactBook.readFromXml(node);
}
public void reload() {
    sosconnector.Parser.DomParser domFromSource = createDomFromSource(sourceParser);
    if (domFromSource != null)
        this.hashGroup = new sosconnector.Parser.NodeParser(domFromSource, configure).parse();
    
    this.hashGroup = new java.util.LinkedList<>();
}
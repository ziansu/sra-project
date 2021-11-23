public void parseNodeBody(dyvil.tools.dpf.converter.string.NodeVisitor visitor) {
    while (true) {
        if (!((this.tokens.hasNext()) && (this.parseNodeElement(visitor)))) {
            break;
        }
    } 
    visitor.visitEnd();
}
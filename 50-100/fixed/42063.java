@java.lang.Override
public void replaceData(final int offset, final int count, final java.lang.String arg) throws org.w3c.dom.DOMException {
    if ((offset < 0) || (count < 0)) {
        throw new org.w3c.dom.DOMException(org.w3c.dom.DOMException.INDEX_SIZE_ERR, "offset is out of bounds");
    }
    throw new java.lang.UnsupportedOperationException(("Operation is unsupported on node type: " + (this.getNodeType())));
}
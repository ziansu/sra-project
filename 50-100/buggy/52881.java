@java.lang.Override
public java.lang.String substringData(final int offset, final int count) throws org.w3c.dom.DOMException {
    if (offset < 0) {
        throw new org.w3c.dom.DOMException(org.w3c.dom.DOMException.INDEX_SIZE_ERR, "offset is out of bounds");
    }
    if ((cdata) == null) {
        throw new org.w3c.dom.DOMException(org.w3c.dom.DOMException.DOMSTRING_SIZE_ERR, "string index out of bounds");
    }
    if (offset > (cdata.length())) {
        throw new org.w3c.dom.DOMException(org.w3c.dom.DOMException.INDEX_SIZE_ERR, "offset is out of bounds");
    }
    return cdata.substring(offset, count);
}
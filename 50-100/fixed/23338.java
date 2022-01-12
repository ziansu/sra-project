@java.lang.Override
public void insertData(final int offset, final java.lang.String arg) throws org.w3c.dom.DOMException {
    if (offset < 0) {
        throw new org.w3c.dom.DOMException(org.w3c.dom.DOMException.INDEX_SIZE_ERR, "offset is out of bounds");
    }
    if ((cdata) == null) {
        cdata = new org.exist.util.XMLString(arg.toCharArray());
    }else {
        if (offset > (cdata.length())) {
            throw new org.w3c.dom.DOMException(org.w3c.dom.DOMException.INDEX_SIZE_ERR, "offset is out of bounds");
        }
        cdata.insert(offset, arg);
    }
}
public static com.nec.congenio.test.MockPathContext create(@javax.annotation.Nullable
org.w3c.dom.Element root) {
    com.nec.congenio.test.MockPathContext path = new com.nec.congenio.test.MockPathContext();
    if (root != null) {
        for (org.w3c.dom.Element e : com.nec.congenio.xml.XML.getElements(root)) {
            path.set(e.getTagName(), e);
        }
    }
    return path;
}
@java.lang.Override
public void beginObject(nz.co.senanque.schemaparser.ObjectDescriptor objectDescriptor) {
    org.jdom.Element root = elements.peek();
    org.jdom.Element o = new org.jdom.Element(objectDescriptor.getName());
    root.addContent(o);
    elements.push(o);
}
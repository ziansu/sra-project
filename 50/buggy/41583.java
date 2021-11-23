@java.lang.Override
public void beginObject(nz.co.senanque.schemaparser.ObjectDescriptor objectDescriptor) {
    org.jdom.Element root = elements.peek();
    org.jdom.Element o = root.addContent(new org.jdom.Element(objectDescriptor.getName()));
    elements.push(o);
}
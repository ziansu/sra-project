public boolean add(T element, P parent) throws br.uff.midiacom.xml.XMLException {
    if (element == null)
        throw new br.uff.midiacom.xml.XMLException("Null element.");
    
    for (T el : elements) {
        if (el.compare(element)) {
            elements.remove(el);
            break;
        }
    }
    if (elements.add(element)) {
        element.setParent(parent);
        return true;
    }
    return false;
}
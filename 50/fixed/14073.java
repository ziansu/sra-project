public <T extends de.tucottbus.kt.lcars.elements.EElement> T add(T el) {
    synchronized(elements) {
        if (!(elements.contains(el)))
            elements.add(el);
        
    }
    return el;
}
public void addElements(java.util.Collection<blitzEdit.core.Element> elements) {
    if (elements != null) {
        for (blitzEdit.core.Element elem : elements) {
            if (_elements.contains(elem))
                continue;
            
            _elements.add(elem);
        }
    }
}
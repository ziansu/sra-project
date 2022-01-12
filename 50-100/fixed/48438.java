public void addElement(blitzEdit.core.Element elem) {
    if ((elem == null) || (_elements.contains(elem)))
        return ;
    
    if (elem instanceof blitzEdit.core.Component) {
        for (blitzEdit.core.Connector con : ((blitzEdit.core.Component) (elem)).getConnectors()) {
            _elements.add(con);
        }
    }
    _elements.add(elem);
}
public void removeElementByID(java.lang.String ID) {
    for (com.github.infosimulators.gui.gelements.GElement element : new java.util.ArrayList<com.github.infosimulators.gui.gelements.GElement>(elements)) {
        if ((element.getID()) == ID) {
            elements.remove(element);
        }
    }
}
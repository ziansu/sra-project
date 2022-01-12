public java.lang.Object getValueAt(int row, int col) {
    com.clarkparsia.sbol.editor.Registry registry = getComponent(row);
    switch (col) {
        case 0 :
            return registry.getName();
        case 1 :
            return registry.isBuiltin() ? "N/A" : registry.getLocation();
        case 2 :
            return registry.getDescription();
        default :
            throw new java.lang.IndexOutOfBoundsException();
    }
}
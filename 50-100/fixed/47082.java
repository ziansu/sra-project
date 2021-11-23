void addInternalNet(java.lang.String name, java.lang.String type, java.util.List<java.lang.String> fullPinNames) {
    if ((this.internalNets) == null) {
        this.internalNets = new java.util.ArrayList<>();
    }
    this.internalNets.add(new edu.byu.ece.rapidSmith.design.subsite.LibraryMacro.InternalNet(name, type, fullPinNames));
}
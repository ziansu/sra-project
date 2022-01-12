private boolean NameIsInUse(java.lang.String Name, com.cburch.logisim.circuit.Circuit changed) {
    for (com.cburch.logisim.tools.Library mylib : getLibraries()) {
        if (NameIsInLibraries(mylib, Name))
            return true;
        
    }
    for (com.cburch.logisim.circuit.Circuit mytool : this.getCircuits()) {
        if ((Name.toUpperCase().equals(mytool.getName().toUpperCase())) && (!(mytool.equals(changed))))
            return true;
        
    }
    return false;
}
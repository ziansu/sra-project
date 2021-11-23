private boolean NameIsInLibraries(com.cburch.logisim.tools.Library lib, java.lang.String Name) {
    if (Name.isEmpty())
        return false;
    
    for (com.cburch.logisim.tools.Library mylib : lib.getLibraries()) {
        if (NameIsInLibraries(mylib, Name))
            return true;
        
    }
    for (com.cburch.logisim.tools.Tool mytool : lib.getTools()) {
        if (Name.toUpperCase().equals(mytool.getName().toUpperCase()))
            return true;
        
    }
    return false;
}
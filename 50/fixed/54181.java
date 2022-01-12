private boolean minDistance() {
    for (com.github.ilms49898723.fluigi.device.component.BaseComponent c : mSymbolTable.getComponents()) {
        if (!(fixComponentPosition(c.getIdentifier())))
            return false;
        
    }
    return true;
}
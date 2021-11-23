private boolean isChild(java.util.List<eppic.assembly.Assembly> parents) {
    for (eppic.assembly.Assembly invalidGroup : parents) {
        if (this.isChild(invalidGroup))
            return true;
        
    }
    return false;
}
public jbse.bc.ExceptionTableEntry getEntry(java.util.List<java.lang.String> excTypes, int PC) {
    for (jbse.bc.ExceptionTableEntry tmpEntry : this.exTable) {
        if (((excTypes.contains(tmpEntry.getType())) && (PC >= (tmpEntry.getStartPC()))) && (PC < (tmpEntry.getEndPC()))) {
            return tmpEntry;
        }
    }
    return null;
}
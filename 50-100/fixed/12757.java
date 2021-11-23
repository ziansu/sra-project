public boolean inLabels(java.util.HashSet<java.lang.String> hashSet) {
    if (hashSet != null) {
        if (hashSet.isEmpty())
            return true;
        
        for (java.lang.String str : hashSet) {
            if (((this.label) != null) && (this.label.equalsIgnoreCase(str)))
                return true;
            
        }
        return false;
    }else {
        return true;
    }
}
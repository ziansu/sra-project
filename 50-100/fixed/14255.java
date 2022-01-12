public boolean isChild(eppic.assembly.Assembly potentialParent) {
    for (int i = 0; i < (this.engagedSet.length); i++) {
        if (potentialParent.engagedSet[i]) {
            if (!(this.engagedSet[i]))
                return false;
            
        }
    }
    return true;
}
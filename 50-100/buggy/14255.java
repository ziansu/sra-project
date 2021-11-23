private boolean isChild(eppic.assembly.Assembly potentialParent) {
    for (int i = 0; i < (this.engagedSet.length); i++) {
        if ((potentialParent.engagedSet[i]) && (this.engagedSet[i])) {
            return true;
        }
    }
    return false;
}
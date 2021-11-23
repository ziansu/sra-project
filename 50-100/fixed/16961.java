public com.wrathOfLoD.Utility.Direction planar() {
    int planarQ = this.qMod;
    int planarR = this.rMod;
    int planarS = this.sMod;
    int planarH = 0;
    for (com.wrathOfLoD.Utility.Direction dir : com.wrathOfLoD.Utility.Direction.values()) {
        if (dir.matches(planarQ, planarR, planarS, planarH)) {
            return dir;
        }
    }
    throw new java.lang.EnumConstantNotPresentException(com.wrathOfLoD.Utility.Direction.class, ("Could not find planar of " + (this.name())));
}
public org.verapdf.pd.PDExtGState getExtGState(org.verapdf.as.ASAtom name) {
    org.verapdf.pd.PDExtGState state;
    if ((this.objectResources) != null) {
        state = this.objectResources.getExtGState(name);
        if (state == null) {
            state = this.pageResources.getExtGState(name);
            setInherited(state, true);
        }
    }else {
        state = this.pageResources.getExtGState(name);
        setInherited(state, inheritedResources);
    }
    return state;
}
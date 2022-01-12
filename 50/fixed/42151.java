public boolean getEnabled(long objId) {
    if (!(containsLabel(MDLabel.MDL_ENABLED)))
        return true;
    
    return (getValueInt(MDLabel.MDL_ENABLED, objId)) > (-1);
}
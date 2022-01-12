public void setSimpleMode(boolean val) {
    if (val) {
        normalMode = false;
    }else {
        throw new java.lang.UnsupportedOperationException(ZLocalization.loc.getString("ds.z.DefaultEvacuationFloor.SwitchToNormalModeException"));
    }
}
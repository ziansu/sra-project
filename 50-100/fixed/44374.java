@java.lang.Override
public void setEnabled(boolean enable) {
    super.setEnabled(enable);
    if (!enable) {
        fillWithOnes();
    }
    for (java.awt.Component comp : table.getComponents()) {
        comp.setEnabled(enable);
    }
    if ((selectRandS.isSelected()) && enable) {
        modeRandS(true);
    }else
        if ((selectAbs.isSelected()) && enable) {
            modeRandS(false);
        }
    
}
@java.lang.Override
public java.lang.Object getCellEditorValue() {
    if (this.isPushed()) {
        if (this.getLabel().equals(Configurations.CCTM_BUTTON_NAME)) {
            cctmFrame.setVisible(true);
        }else
            if (this.getLabel().equals(Configurations.STD_BUTTON_NAME)) {
                stdFrame.setVisible(true);
            }else
                if (this.getLabel().equals(Configurations.FTD_BUTTON_NAME)) {
                    ftdFrame.setVisible(true);
                }
            
        
    }
    setPushed(false);
    return this.getLabel();
}
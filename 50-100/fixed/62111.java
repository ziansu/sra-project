private void setNoNcValue(org.grandviewtech.userinterface.screen.ColumnScreen columnScreen) {
    org.grandviewtech.entity.enums.NoNc nonc = null;
    if (NO.isSelected()) {
        nonc = org.grandviewtech.entity.enums.NoNc.NO;
    }else
        if (NC.isSelected()) {
            nonc = org.grandviewtech.entity.enums.NoNc.NC;
        }
    
    if (((SET) != null) && (SET.isSelected())) {
        nonc = org.grandviewtech.entity.enums.NoNc.SET;
    }else
        if (((RESET) != null) && (RESET.isSelected())) {
            nonc = org.grandviewtech.entity.enums.NoNc.RESET;
        }
    
    columnScreen.setNonc(nonc);
}
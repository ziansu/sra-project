private void setDefaultNoNcOption(org.grandviewtech.userinterface.screen.ColumnScreen columnScreen) {
    org.grandviewtech.entity.enums.NoNc nonc = columnScreen.getNonc();
    if (nonc != null) {
        switch (nonc) {
            case NC :
                {
                    NO.setSelected(false);
                    NC.setSelected(true);
                    break;
                }
            case NO :
                {
                    NO.setSelected(true);
                    NC.setSelected(false);
                    break;
                }
            default :
                {
                    NO.setSelected(true);
                    NC.setSelected(false);
                    break;
                }
        }
    }
}
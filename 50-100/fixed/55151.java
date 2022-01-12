public void setActiveButtons() {
    if ((radonsoft.radoncalc.fragments.converter.valueIDInt) == 3) {
        switch (radonsoft.radoncalc.fragments.converter.spinner1.getSelectedItemPosition()) {
            case 0 :
                buttonsActivator = 0;
                break;
            case 1 :
                buttonsActivator = 2;
                break;
            case 2 :
                buttonsActivator = 3;
                break;
            default :
                buttonsActivator = 0;
                break;
        }
    }else {
        buttonsActivator = 0;
    }
}
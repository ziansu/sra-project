public void setOrientation(java.lang.String ori) {
    switch (ori) {
        case "vertical_up" :
            setOrientation(jmri.jmrit.display.PositionablePopupUtil.VERTICAL_UP);
            break;
        case "vertical_down" :
            setOrientation(jmri.jmrit.display.PositionablePopupUtil.VERTICAL_DOWN);
            break;
        default :
            setOrientation(jmri.jmrit.display.PositionablePopupUtil.HORIZONTAL);
            break;
    }
}
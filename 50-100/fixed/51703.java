@java.lang.Override
protected void layoutLastComponent(com.vaadin.ui.Component component) {
    switch (getPacking()) {
        case EXPAND :
            if (component instanceof de.syngenio.vaadin.synergy.SynergyView.ItemComponent) {
                layoutComponent(component, "100%", 1, Alignment.MIDDLE_RIGHT);
            }else {
                layoutComponent(component, null, 0, Alignment.MIDDLE_RIGHT);
            }
            break;
        case SPACE_AFTER :
        case SPACE_AROUND :
            layoutComponent(component, null, 1, Alignment.TOP_RIGHT);
            break;
        case SPACE_BEFORE :
            layoutComponent(component, null, 0, Alignment.MIDDLE_RIGHT);
            break;
    }
}
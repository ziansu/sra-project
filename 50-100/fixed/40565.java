@java.lang.Override
protected void layoutFirstComponent(com.vaadin.ui.Component component) {
    switch (getPacking()) {
        case EXPAND :
            layoutComponent(component, "100%", 1, Alignment.MIDDLE_RIGHT);
            break;
        case SPACE_AROUND :
        case SPACE_BEFORE :
            layoutComponent(component, null, 1, Alignment.BOTTOM_RIGHT);
            break;
        case SPACE_AFTER :
            layoutComponent(component, null, 0, Alignment.MIDDLE_RIGHT);
            break;
    }
}
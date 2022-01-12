@java.lang.Override
protected void layoutSingularComponent(com.vaadin.ui.Component component) {
    switch (getPacking()) {
        case EXPAND :
            layoutComponent(component, "100%", 0, Alignment.MIDDLE_RIGHT);
            break;
        case SPACE_AFTER :
            layoutComponent(component, null, 0, Alignment.TOP_RIGHT);
            break;
        case SPACE_BEFORE :
            layoutComponent(component, null, 0, Alignment.BOTTOM_RIGHT);
            break;
        case SPACE_AROUND :
            layoutComponent(component, null, 0, Alignment.MIDDLE_RIGHT);
            break;
    }
}
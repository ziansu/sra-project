@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    navigateTo(viewProvider.getParentViewName(viewId), false);
}
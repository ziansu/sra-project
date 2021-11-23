@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    navigateTo(this.viewProvider.getParentViewName(viewId), false);
}
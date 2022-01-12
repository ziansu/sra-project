@java.lang.Override
public void run() {
    if (!currentSkipFocus) {
        if (currentStartAtBeginning) {
            org.vaadin.grid.enhancements.client.navigation.NavigationUtil.focusFirstEditableElementFromFirstElementOfRow(this.grid, 0, currentThis, this.shiftKeyDown);
        }
        com.vaadin.client.VConsole.error(("shiftKeyDown: " + (this.shiftKeyDown)));
        org.vaadin.grid.enhancements.client.navigation.NavigationUtil.focusInputField(this.grid, this.shiftKeyDown);
        this.shiftKeyDown = false;
    }else {
        setSkipFocus(shiftKey);
    }
}
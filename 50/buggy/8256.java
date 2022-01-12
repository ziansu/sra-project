@java.lang.Override
protected void restoreState() {
    java.lang.System.out.println("COLOR MENU RESTORE STATE");
    for (menu.ColorMenu.ComponentState comp : this.componentStates) {
        comp.setSelectedColorMode(comp.getActiveColorMode());
    }
    componentList.clearSelection();
    colorList.clearSelection();
}
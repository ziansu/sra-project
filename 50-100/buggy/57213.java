public void mouseClicked(java.awt.event.MouseEvent e) {
    java.lang.String colorName = ((java.lang.String) (colorList.getSelectedValue()));
    java.lang.String compName = ((java.lang.String) (componentList.getSelectedValue()));
    for (menu.ColorMenu.ComponentState state : componentStates) {
        if (state.getName().equals(compName)) {
            state.setSelectedColorMode(getColorMode(colorName));
            java.lang.System.out.println(state.getActiveColorMode());
            java.lang.System.out.println(state.getSelectedColorMode());
        }
    }
}
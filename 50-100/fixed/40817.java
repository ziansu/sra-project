private boolean splitValue(java.lang.String value) {
    for (int i = 0; i < (combo.getItemCount()); i++) {
        com.izforge.izpack.panels.userinput.field.Choice item = ((com.izforge.izpack.panels.userinput.field.Choice) (combo.getItemAt(i)));
        if (value.equals(item.getTrueValue())) {
            combo.setSelectedIndex(i);
            return true;
        }
    }
    return false;
}
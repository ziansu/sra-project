public static <E extends java.lang.Enum<E>> void select(com.google.gwt.user.client.ui.ListBox cbo, E value) {
    int count = cbo.getItemCount();
    for (int i = 0; i < count; i++) {
        if (cbo.getItemText(i).equals(value.toString())) {
            cbo.setSelectedIndex(i);
            break;
        }
    }
}
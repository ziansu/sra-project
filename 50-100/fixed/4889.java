public static void select(com.google.gwt.user.client.ui.ListBox cbo, java.lang.String value) {
    int count = cbo.getItemCount();
    for (int i = 0; i < count; i++) {
        if (cbo.getValue(i).equals(value)) {
            cbo.setSelectedIndex(i);
            break;
        }
    }
}
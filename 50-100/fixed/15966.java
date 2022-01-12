@java.lang.Override
public void textChange(com.vaadin.event.FieldEvents.TextChangeEvent event) {
    java.lang.String pid = event.getText();
    tk.packattk.utils.Person p = tk.packattk.utils.DatabaseWrappers.getPerson(pid);
    if (p != null) {
        java.util.Collection<java.lang.Package> packages = tk.packattk.utils.DatabaseWrappers.getPackages(p);
        packageContainer.removeAllItems();
        if (packages != null) {
            packageContainer.addAll(packages);
            pid_field.setEnabled(false);
        }
    }else {
        packageContainer.removeAllItems();
    }
}
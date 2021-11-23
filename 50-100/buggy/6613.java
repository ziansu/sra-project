@java.lang.Override
protected void updateItem(program.Employee t, boolean bln) {
    super.updateItem(t, bln);
    if (t != null) {
        setText((((((t.getId()) + " ") + (t.getName())) + " ") + (t.getPayRate())));
    }else {
        listviewEmployees.setPlaceholder(new javafx.scene.control.Label("No Employees"));
    }
}
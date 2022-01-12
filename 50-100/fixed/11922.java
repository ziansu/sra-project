public void editClass(android.view.View view) {
    java.util.List<android.widget.CheckBox> selectedClasses = projectManager.getCheckedCheckBoxes();
    switch (selectedClasses.size()) {
        case 0 :
            break;
        case 1 :
            {
                editSingleClass(selectedClasses);
                break;
            }
        default :
            {
            }
    }
}
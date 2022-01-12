public void viewClass(android.view.View view) {
    java.util.List<android.widget.CheckBox> selectedClasses = projectManager.getCheckedCheckBoxes();
    switch (selectedClasses.size()) {
        case 0 :
            break;
        case 1 :
            {
                viewSingleClass(selectedClasses);
                break;
            }
        default :
            {
                viewMultipleClasses(selectedClasses);
                break;
            }
    }
}
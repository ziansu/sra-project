@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    int position = (buttonView.getId()) - (com.github.dkharrat.nexusdialog.controllers.CheckBoxController.CHECKBOX_ID);
    java.lang.Object value = (areValuesDefined()) ? values.get(position) : position;
    java.util.Set<java.lang.Object> modelValues = new java.util.HashSet<>(retrieveModelValues());
    if (isChecked) {
        modelValues.add(value);
    }else {
        modelValues.remove(value);
    }
    getModel().setValue(getName(), modelValues);
}
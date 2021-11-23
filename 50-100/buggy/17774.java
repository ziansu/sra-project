@java.lang.Override
public void onResourceSelected(org.datacleaner.widgets.ResourceTypePresenter<?> presenter, org.apache.metamodel.util.Resource resource) {
    if (org.datacleaner.util.StringUtils.isNullOrEmpty(_datastoreNameTextField.getText())) {
        _datastoreNameTextField.setText(resource.getName());
    }
    validateAndUpdate();
    onSelected(resource);
}
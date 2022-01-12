private java.lang.String getWord(android.view.View v) {
    android.view.View parentView = ((android.view.View) (v.getParent()));
    ca.rmen.android.poetassistant.databinding.ListItemWordBinding binding = ((ca.rmen.android.poetassistant.databinding.ListItemWordBinding) (parentView.getTag()));
    return ((java.lang.String) (binding.text1.getText()));
}
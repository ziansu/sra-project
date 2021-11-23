@java.lang.Override
public void setValue(org.unicef.rapidreg.forms.Field field) {
    fields = removeSeparatorFields(field.getSubForm().getFields());
    fieldParent = field.getDisplayName().get(java.util.Locale.getDefault().getLanguage());
    attachParentToFields(fields, fieldParent);
    addSubFormBtn.setText(java.lang.String.format("%s %s", context.getString(R.string.add), fieldParent));
    addSubFormBtn.setVisibility((activity.getCurrentFeature().isEditMode() ? android.view.View.VISIBLE : android.view.View.GONE));
    restoreSubForms();
}
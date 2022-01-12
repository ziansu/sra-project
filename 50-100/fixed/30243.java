@java.lang.Override
public void onFieldChanged(java.lang.String column, java.lang.String value) {
    if (!(isFieldChanged(column, value))) {
        return ;
    }
    if (hasShortAndLongForms()) {
        com.android.contacts.editor.PhoneticNameEditorView.PhoneticValuesDelta entry = ((com.android.contacts.editor.PhoneticNameEditorView.PhoneticValuesDelta) (getEntry()));
        boolean isEditingUnstructuredPhoneticName = !(areOptionalFieldsVisible());
        if (isEditingUnstructuredPhoneticName == (com.android.contacts.editor.PhoneticNameEditorView.isUnstructuredPhoneticNameColumn(column))) {
            super.onFieldChanged(column, value);
        }
    }else {
        super.onFieldChanged(column, value);
    }
}
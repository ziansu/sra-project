private void updateIndexForFields() {
    for (int i = 0; i <= (itemValues.getChildrenAsJsonArray(fieldParent).size()); i++) {
        android.view.View child = parent.getChildAt(i);
        android.support.v7.widget.RecyclerView fieldList = ((android.support.v7.widget.RecyclerView) (child.findViewById(R.id.field_list)));
        org.unicef.rapidreg.childcase.CaseRegisterAdapter adapter = ((org.unicef.rapidreg.childcase.CaseRegisterAdapter) (fieldList.getAdapter()));
        java.util.List<org.unicef.rapidreg.forms.childcase.CaseField> fields = adapter.getFields();
        assignIndexForFields(fields, i);
    }
}
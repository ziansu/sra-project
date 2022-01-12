@java.lang.Override
public void setValue(org.unicef.rapidreg.forms.childcase.CaseField field) {
    labelView.setText(getLabel(field));
    disableUnediatbleField(field, valueView);
    if (isSubformField(field)) {
        valueView.setChecked(java.lang.Boolean.valueOf(getValue(field)));
    }else {
        valueView.setChecked(java.lang.Boolean.valueOf(org.unicef.rapidreg.service.cache.CaseFieldValueCache.get(getLabel(field))));
    }
}
private void CheckBoxReflect(java.lang.String dow) {
    boolean isCheck = DOWMap.get(dow);
    DOWCheckBox.get(dow).setChecked(isCheck);
}
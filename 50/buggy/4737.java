private void CheckBoxReflect(java.lang.String dow) {
    boolean isCheck = DOWMap.get(dow);
    com.example.matsumotokazuya.mynidonealarm.LogUtil.LogString(((dow + "reflect") + isCheck));
    DOWCheckBox.get(dow).setChecked(isCheck);
}
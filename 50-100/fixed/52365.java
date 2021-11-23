@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    com.app.beans.MotorItem mItem = getMotorObjectforTag(((java.lang.String) (EditmotorName.getTag())));
    if (mItem != null)
        mItem.setPumpName(EditmotorName.getText().toString());
    
}
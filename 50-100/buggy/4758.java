@java.lang.Override
public void dialogData(java.lang.String newData, java.lang.String oldData, android.os.Bundle extras) {
    if ((newData == null) || ((newData != null) && ((newData.length()) < 1))) {
        android.widget.Toast.makeText(mContext, mContext.getString(R.string.text_not_saved), Toast.LENGTH_SHORT).show();
        return ;
    }
    if (extras != null) {
        editUser(extras, newData, oldData);
    }else {
        editCard(newData, oldData);
    }
}
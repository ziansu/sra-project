@java.lang.Override
public void onFinishFilterDialog(java.lang.String sortByVal, java.lang.String beginDateVal, java.lang.String newsDeskVal) {
    android.widget.Toast.makeText(this, ("Hi, " + sortByVal), Toast.LENGTH_SHORT).show();
    sortBy = sortByVal;
    beginDate = beginDateVal;
    newsDesk = newsDeskVal;
}
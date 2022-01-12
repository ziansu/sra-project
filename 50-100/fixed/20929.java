@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String x = retrieveMyPHP.deleteUserOrg(MyApplication.userName, Outfit.getOrgId());
    dbHelper.deleteUserOrg(dbHelper.getWritableDatabase(), Outfit.getOrgId());
    android.widget.Toast.makeText(mActivity.getApplicationContext(), x, Toast.LENGTH_SHORT).show();
    mOrganizations.remove(position);
    notifyDataSetChanged();
}
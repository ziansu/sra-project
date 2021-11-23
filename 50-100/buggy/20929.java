@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String x = retrieveMyPHP.deleteUserOrg(MyApplication.userName, Outfit.getOrgId());
    android.widget.Toast.makeText(mActivity.getApplicationContext(), x, Toast.LENGTH_SHORT).show();
    if (x.equals("Organization deleted!")) {
        dbHelper.deleteUserOrg(dbHelper.getWritableDatabase(), Outfit.getOrgId());
        mOrganizations.remove(position);
        notifyDataSetChanged();
    }
}
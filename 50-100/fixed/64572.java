@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_permission);
    listViewPermission = ((android.widget.ListView) (findViewById(R.id.listview_permission)));
    java.util.ArrayList<com.reversecoder.permission.model.ManifestPermission> data = com.reversecoder.permission.util.PermissionUtil.getAllCustomizedPermissions(this, com.reversecoder.permission.util.PermissionUtil.getPackageName(this));
    permissionListViewAdapter = new com.reversecoder.permission.adapter.PermissionListViewAdapter(this, data, permissionItemClickListener);
    listViewPermission.setAdapter(permissionListViewAdapter);
}
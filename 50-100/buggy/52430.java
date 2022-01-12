@java.lang.Override
protected void createView(android.view.View view, android.os.Bundle savedInstanceState) {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (find(R.id.toolbar)));
    mSetSupportToolbarCallBack.setSupportToolbar(toolbar);
    mDrawer = ((android.support.v4.widget.DrawerLayout) (find(R.id.drawer_layout)));
    mOrganizationSpinner = ((android.widget.Spinner) (find(R.id.organization_spinner)));
    mSignatureSpinner = ((android.widget.Spinner) (find(R.id.signature_spinner)));
    mMessageEditText = ((android.widget.EditText) (find(R.id.type_message_edit_text)));
    initEvent();
}
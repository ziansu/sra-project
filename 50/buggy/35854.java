@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mFragment.setSetSupportToolbarCallBack(new io.innofang.autosms.base.BaseFragment.SetSupportToolbarCallBack() {
        @java.lang.Override
        public void setSupportToolbar(android.support.v7.widget.Toolbar toolbar) {
            io.innofang.autosms.module.edit_message.EditMessageActivity.this.setSupportActionBar(toolbar);
        }
    });
}
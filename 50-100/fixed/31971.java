@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mBinding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_main);
    mPresenter = new com.framgia.fpoll.ui.main.MainPresenter(this, com.framgia.fpoll.data.source.remote.login.LoginRepository.getInstance(getApplicationContext()), com.framgia.fpoll.data.source.remote.settings.SettingRepository.getInstance(getApplicationContext()), com.framgia.fpoll.util.SharePreferenceUtil.getIntances(this));
    mBinding.setPresenter(((com.framgia.fpoll.ui.main.MainPresenter) (mPresenter)));
    mBinding.setHandler(new com.framgia.fpoll.ui.main.MainHandler(mPresenter));
    mBinding.setView(this);
}
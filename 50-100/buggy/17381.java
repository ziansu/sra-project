@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mSettingsFragBinding = wanthavers.mad.cs.fau.de.wanthavers_android.databinding.SettingsFragBinding.inflate(inflater, container, false);
    mPresenter.getUser(mDesireLogic.getLoggedInUserId());
    setHasOptionsMenu(true);
    mSettingsActionHandler = new wanthavers.mad.cs.fau.de.wanthavers_android.settings.SettingsActionHandler(mPresenter, mSettingsFragBinding, mSelectImageLogic);
    mSettingsFragBinding.setActionHandler(mSettingsActionHandler);
    return mSettingsFragBinding.getRoot();
}
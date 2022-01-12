@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    mBinding = com.framgia.fdms.databinding.DialogExportBinding.inflate(inflater, container, false);
    getDataFromIntent();
    mViewModel = new com.framgia.fdms.screen.profile.export.ExportViewModel(this, mDevices);
    com.framgia.fdms.screen.profile.export.ExportContract.Presenter presenter = new com.framgia.fdms.screen.profile.export.ExportPresenter(mUser, mViewModel, this.getActivity());
    mViewModel.setPresenter(presenter);
    mBinding.setViewModel(mViewModel);
    return mBinding.getRoot();
}
@android.support.annotation.Nullable
@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.M)
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mScannerView = new me.dm7.barcodescanner.zxing.ZXingScannerView(getActivity());
    progress = new android.app.ProgressDialog(getActivity());
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        requestPermissions(new java.lang.String[]{ Manifest.permission.CAMERA }, postApp.ActivitiesView.MenuView.FragmentViews.PairingView.QrCodeView.PERMISSION_REQUEST_CAMERA);
    }else {
        mScannerView.startCamera();
    }
    qrPres = new postApp.Presenters.MenuPresenters.FragmentPresenters.PairingPresenter.QrCodePresenter(this);
    return mScannerView;
}
@java.lang.Override
public void onClick(android.view.View v) {
    v.setActivated((!(v.isActivated())));
    android.content.Intent intent = new android.content.Intent(getActivity(), org.akvo.akvoqr.CameraActivity.class);
    intent.putExtra(Constant.BRAND, brand);
    startActivity(intent);
}
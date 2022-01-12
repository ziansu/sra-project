@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    deviceUID = com.itp.glevinzon.capstone.MathpixUUID.uuid(getContext());
    webview_container = ((android.widget.RelativeLayout) (view.findViewById(R.id.webview_container)));
    webView = ((android.webkit.WebView) (view.findViewById(R.id.webView)));
    setupButton(view);
    setupCropControl(view);
    if (!(com.itp.glevinzon.capstone.MarshmallowPermissions.checkPermissionForCamera(getActivity()))) {
        com.itp.glevinzon.capstone.MarshmallowPermissions.requestPermissionForCamera(getActivity());
    }
}
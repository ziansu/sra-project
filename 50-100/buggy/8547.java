@java.lang.Override
public void onDownloadStart(java.lang.String url, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimetype, long contentLength) {
    android.net.Uri uri = android.net.Uri.parse(url);
    android.widget.Toast.makeText(cordova.getActivity(), uri.toString(), Toast.LENGTH_LONG).show();
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW, uri);
    cordova.getActivity().startActivity(intent);
}
@java.lang.Override
public void onPermissionGranted() {
    final com.afollestad.materialdialogs.MaterialDialog dialog = jahirfiquitiva.iconshowcase.dialogs.ISDialogs.showBuildingRequestDialog(context);
    dialog.show();
    com.pitchedapps.butler.iconrequest.IconRequest.get().send(new com.pitchedapps.butler.iconrequest.IconRequest.OnRequestReady() {
        @java.lang.Override
        public void doWhenReady() {
            dialog.dismiss();
        }
    });
}
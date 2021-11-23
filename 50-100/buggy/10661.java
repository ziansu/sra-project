@java.lang.Override
public void onPermissionGranted() {
    final com.afollestad.materialdialogs.MaterialDialog dialog = jahirfiquitiva.iconshowcase.dialogs.ISDialogs.showBuildingRequestDialog(context);
    if ((getResources().getInteger(R.integer.max_apps_to_request)) > (-1)) {
        if ((maxApps) < 0) {
            maxApps = 0;
        }
    }else {
        dialog.show();
        com.pitchedapps.butler.iconrequest.IconRequest.get().send(new com.pitchedapps.butler.iconrequest.IconRequest.OnRequestReady() {
            @java.lang.Override
            public void doWhenReady() {
                dialog.dismiss();
            }
        });
    }
}
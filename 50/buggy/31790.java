@java.lang.Override
public void onClick(android.view.View v) {
    if (!(hasPermissionInManifest(getContext(), android.Manifest.permission.CAMERA.toString()))) {
        requestPermissions(new java.lang.String[]{ android.Manifest.permission.CAMERA }, tvao.mmad.itu.tingle.Controller.Fragments.ThingDetailFragment.REQUEST_PHOTO);
    }
    startActivityForResult(captureImage, tvao.mmad.itu.tingle.Controller.Fragments.ThingDetailFragment.REQUEST_PHOTO);
}
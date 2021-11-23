@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.i("CameraActivity", ("ID: " + (artifactId)));
    if ((getActivity()) instanceof edu.uw.prathh.musee.camera.CameraActivity) {
        ((edu.uw.prathh.musee.camera.CameraActivity) (getActivity())).openGallery(artifactId);
    }else
        if ((getActivity()) instanceof edu.uw.prathh.musee.info.FavoritesActivity) {
            ((edu.uw.prathh.musee.info.FavoritesActivity) (getActivity())).openGallery(artifactId);
        }
    
}
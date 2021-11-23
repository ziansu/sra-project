@java.lang.Override
public void onFailure() {
    org.parallax3d.parallax.Log.error(("An error occurred while loading file: " + (file.path())));
}
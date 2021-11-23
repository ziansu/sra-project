@java.lang.Override
public void onSuccess(org.parallax3d.parallax.files.FileHandle result) {
    org.parallax3d.parallax.Log.info(("Loaded file: " + url));
    this.file = result;
    parse(result);
    onReady();
}
@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    mFileDirectory = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
    super.onCreate(savedInstanceState);
}
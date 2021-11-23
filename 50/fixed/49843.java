@java.lang.Override
public void changePath(org.brandroid.openmanager.data.OpenPath path) {
    super.changePath(path);
    try {
        mPathItems = path.list();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
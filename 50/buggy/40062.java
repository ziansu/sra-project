@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    getLoaderManager().initLoader(app.com.io.codephillip.soccerdashboard.Fixtures.LOADER_ID, null, this);
}
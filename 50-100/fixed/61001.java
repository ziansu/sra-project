@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    appBarLayout.setElevation(5);
    fragmentListener.onBackHome();
    gazzetteList.setAdapter(simpleCursorAdapter);
    getLoaderManager().initLoader(0, null, this);
    super.onViewCreated(view, savedInstanceState);
}
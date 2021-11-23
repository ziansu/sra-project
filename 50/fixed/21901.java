private void displayScreen(net.rossharper.hexrot.android.ScreenFactory screenFactory) {
    mFragmentManager.beginTransaction().replace(mRootContainerId, ((android.app.Fragment) (screenFactory.getScreen()))).commit();
}
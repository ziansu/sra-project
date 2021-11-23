private void checkOrientation() {
    if (((getResources().getConfiguration().orientation) == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) && (!(getResources().getBoolean(R.bool.isTablet)))) {
        android.support.v7.app.ActionBar tool = ((com.android.pena.david.bakingapp.ui.RecipeActivity) (getActivity())).getSupportActionBar();
        if (tool != null) {
            tool.hide();
            getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
    }
}
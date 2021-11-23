@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    mLoadingIndicator.setVisibility(View.GONE);
    switch (loader.getId()) {
        case com.example.profbola.bakingtime.utils.RecipeConstants.RECIPE_LOADER_ID :
            com.example.profbola.bakingtime.ui.MainActivityFragment fragment = ((com.example.profbola.bakingtime.ui.MainActivityFragment) (getSupportFragmentManager().findFragmentById(R.id.fragment)));
            fragment.changeData(data);
            break;
        default :
            return ;
    }
}
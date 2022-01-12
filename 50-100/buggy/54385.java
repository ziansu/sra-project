@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.search_for_nursery :
            ((com.kareem.mynursery.NavigationContext) (parentActivity)).navigate(com.kareem.mynursery.nursery.NurseryListActivity.class);
        case R.id.profileAddNursery :
            ((com.kareem.mynursery.AuthorizationNavigationContext) (parentActivity)).redirectIfNotAuth(com.kareem.mynursery.nursery.AddNursery.class);
    }
}
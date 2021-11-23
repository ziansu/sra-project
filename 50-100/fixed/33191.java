@org.androidannotations.annotations.ItemClick
void listItemClicked(com.pbylicki.cookbook.data.Recipe item) {
    if ((item.id) == null)
        return ;
    
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putSerializable(com.pbylicki.cookbook.BrowseActivity.USER, user);
    bundle.putSerializable(com.pbylicki.cookbook.BrowseActivity.RECIPE, item);
    com.pbylicki.cookbook.ViewRecipeActivity_.intent(this).bundle(bundle).start();
}
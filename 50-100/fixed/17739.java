@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (mFindCategoriesButton)) {
        android.content.Intent intent = new android.content.Intent(this, ke.co.emichira.myonlinestore.ui.CategoriesActivity.class);
        startActivity(intent);
    }
    if (v == (mSavedRestaurantsButton)) {
        android.content.Intent intent = new android.content.Intent(this, ke.co.emichira.myonlinestore.ui.SavedCategoriesActivity.class);
        startActivity(intent);
    }
}
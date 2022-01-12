@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (mFindCategoriesButton)) {
        java.lang.String categories = mFindCategoriesButton.getText().toString();
        android.content.Intent intent = new android.content.Intent(this, ke.co.emichira.myonlinestore.ui.CategoriesActivity.class);
        intent.putExtra("categories", categories);
        startActivity(intent);
    }
    if (v == (mSavedRestaurantsButton)) {
        android.content.Intent intent = new android.content.Intent(this, ke.co.emichira.myonlinestore.ui.SavedCategoriesActivity.class);
        startActivity(intent);
    }
}
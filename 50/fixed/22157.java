@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    ca.uottawa.cookapp.CookApp.Recipeadapter.notifyDataSetChanged();
    ca.uottawa.cookapp.CookApp.Favouriteadapter.notifyDataSetChanged();
}
public void fillListView(java.lang.String title) {
    db = new yeongdejong.com.assamhouse.DB_Recipes(this);
    java.util.ArrayList<yeongdejong.com.assamhouse.Recipes> cuisines = db.getSelectedCategory(title);
    java.lang.String size = java.lang.String.valueOf(cuisines.size());
    yeongdejong.com.assamhouse.Toast.makeText(this, size, Toast.LENGTH_SHORT).show();
}
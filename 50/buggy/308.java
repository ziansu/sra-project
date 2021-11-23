public com.example.caitlin.cookhelper.Recipe getRecipe(android.content.Context context, long id) {
    return new com.example.caitlin.cookhelper.DatabaseHandler(context).getRecipe(((int) (id)));
}
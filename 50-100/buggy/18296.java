@java.lang.Override
public java.util.List<com.example.profbola.bakingtime.models.Recipe> consumeCusor(android.database.Cursor cursor) {
    java.util.List<com.example.profbola.bakingtime.models.Recipe> recipes = new java.util.ArrayList<>();
    for (int i = 0; i < (cursor.getCount()); i++) {
        cursor.moveToPosition(i);
        recipes.add(new com.example.profbola.bakingtime.models.Recipe(cursor));
    }
    cursor.close();
    return recipes;
}
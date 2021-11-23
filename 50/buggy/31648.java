public void selectRecipeAtPosition(int position) {
    com.groupd.cookbook.objects.Recipe selected = RADP.getItem(position);
    android.widget.EditText editName = ((android.widget.EditText) (findViewById(R.id.recyTitle)));
    name = selected.getName();
}
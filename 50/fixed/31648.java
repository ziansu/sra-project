public void selectRecipeAtPosition(int position) {
    com.groupd.cookbook.objects.Recipe selected = RADP.getItem(position);
    name = selected.getName();
}
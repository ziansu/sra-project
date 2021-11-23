private void deleteIngredient(int position) {
    mIngredientList.remove(position);
    mAddList.remove(position);
    notifyDataSetChanged();
}
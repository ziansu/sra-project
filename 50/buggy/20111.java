private void deleteIngredient(int position) {
    mIngredientList.remove(position);
    mAddList.remove(position);
    android.widget.Toast.makeText(mContext, "Ingredient removed!", Toast.LENGTH_SHORT).show();
    notifyDataSetChanged();
}
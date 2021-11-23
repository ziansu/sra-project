@java.lang.Override
public void onEditCategory(int position) {
    android.widget.Toast.makeText(getContext(), ("editting account " + (categoryList.get(position).getName())), Toast.LENGTH_SHORT).show();
    categoryIndexEditted = position;
    editCategory(position);
}
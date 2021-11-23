@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getContext(), "Item removed!", Toast.LENGTH_SHORT).show();
    remove(getItem(position));
    notifyDataSetChanged();
    java.lang.System.out.println(position);
    GlobalParameters.b.removeProduct(position);
    java.lang.System.out.println(GlobalParameters.b.getAllProducts());
    UpdatePrice();
}
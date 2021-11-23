@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getContext(), "Item removed!", Toast.LENGTH_SHORT).show();
    GlobalParameters.b.removeProduct(position);
    notifyDataSetChanged();
    java.lang.System.out.println(position);
    java.lang.System.out.println(GlobalParameters.b.getAllProducts());
    UpdatePrice();
}
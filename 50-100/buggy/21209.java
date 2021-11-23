@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View v, int i, long l) {
    switchDrawer();
    view.findViewById(R.id.rl_search_subcategories).setVisibility(View.INVISIBLE);
    category = subCategories.get(i);
    ((ir.rasen.myapplication.ui.TextViewFont) (view.findViewById(R.id.txt_search_filter))).setText((((getString(R.string.filter)) + " ") + (subCategories.get(i))));
}
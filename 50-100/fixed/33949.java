@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> spinner, android.view.View view, int position, long itemId) {
    if (first) {
        first = false;
        return ;
    }
    if ((subcategoriesAdapter.getItemViewType(position)) == (com.ayuget.redface.ui.adapter.SubcategoriesAdapter.TYPE_CATEGORY)) {
        subcategory = null;
    }else {
        subcategory = ((com.ayuget.redface.data.api.model.Subcategory) (subcategoriesAdapter.getItem(position)));
    }
    loadTopics();
}
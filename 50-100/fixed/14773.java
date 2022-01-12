@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    thoughtworks.com.androidstarter.Category.Category category = ((thoughtworks.com.androidstarter.Category.Category) (parent.getItemAtPosition(position)));
    android.content.Intent intent = new android.content.Intent(parent.getContext(), thoughtworks.com.androidstarter.TagActivity.class);
    intent.putExtra("categoryID", category.getId());
    parent.getContext().startActivity(intent);
}
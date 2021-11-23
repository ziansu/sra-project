public void onItemClick(android.widget.AdapterView<?> adapter, android.view.View view, int position, long id) {
    com.starbug1.android.mudanews.data.NewsListItem item = items_.get(position);
    if (item instanceof com.starbug1.android.mudanews.data.More) {
        items_.remove(position);
        (page_)++;
        updateList();
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.starbug1.android.mudanews.NewsDetailActivity.class);
        intent.putExtra("link", item.getLink());
        startActivity(intent);
    }
}
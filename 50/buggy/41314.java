public void drawPosts(android.app.Activity _activity) {
    getRestClient(1, "load");
    adapter = new budgetworld.ru.bw.PostsAdapter(_activity, posts);
    android.widget.ListView listView = ((android.widget.ListView) (_activity.findViewById(R.id.lvItems)));
    listView.setAdapter(adapter);
}
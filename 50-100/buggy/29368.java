@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.coveros.coverosmobileapp.blogpost.BlogPost blogPost = blogPosts.get((position - 1));
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.coveros.coverosmobileapp.blogpost.BlogPostReadActivity.class);
    intent.putExtra("blogId", blogPost.getId());
    startActivity(intent);
}
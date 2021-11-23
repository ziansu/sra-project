public void seeAll(android.view.View view) {
    intent = new android.content.Intent(this, com.example.android.week05rachell.SecondActivity.class);
    intent.putExtra("BlogPosts", blogPostArrayList);
    startActivity(intent);
}
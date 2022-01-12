@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.coordinator_template);
    final io.bxbxbai.zhuanlan.bean.Post post = getIntent().getParcelableExtra(StoryFragment.KEY_POST);
    if (post == null) {
        finish();
        return ;
    }
    setTitle(post.getTitle());
    getSupportFragmentManager().beginTransaction().replace(R.id.container, io.bxbxbai.zhuanlan.ui.StoryFragment.newInstance(post)).commit();
}
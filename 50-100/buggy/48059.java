@java.lang.Override
public void initView() {
    id = com.mashell.one.module.read.view.activity.EssayActivity.getIntent().getStringExtra(com.mashell.one.module.read.view.activity.EssayActivity.INTENT_ID);
    mEssayAdapter = new com.mashell.one.module.read.adapter.EssayAdapter();
    mCommentRv.setLoadMoreListener(this);
    mCommentRv.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    mCommentRv.setNestedScrollingEnabled(false);
    mCommentRv.addItemDecoration(new android.support.v7.widget.DividerItemDecoration(this, android.support.v7.widget.DividerItemDecoration.VERTICAL));
    mCommentRv.setPAGE_SIZE(28);
    mCommentRv.setAdapter(mEssayAdapter);
    mPresenter.getAllData(id);
}
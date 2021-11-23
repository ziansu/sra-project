@java.lang.Override
public void showPostCommunite(com.bwf.aiyiqi.entity.ResponsePostCommunite postCommunite) {
    if ((postCommunite.getData()) != null) {
        mReviewNumber.setText((("回帖 （" + (postCommunite.getData().size())) + ")"));
        adapter.addDatas(postCommunite.getData());
    }
}
@java.lang.Override
public void showPostCommunite(com.bwf.aiyiqi.entity.ResponsePostCommunite postCommunite) {
    if (((postCommunite.getData()) != null) && ((postCommunite.getData().size()) != 0)) {
        mReviewNumber.setText((("回帖 （" + (postCommunite.getData().size())) + ")"));
        adapter.addDatas(postCommunite.getData());
    }
}
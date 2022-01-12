private android.support.v7.widget.CardView buildCommentItem(final com.floatingmuseum.mocloud.data.entity.Comment comment) {
    android.support.v7.widget.CardView comment_item = ((android.support.v7.widget.CardView) (android.view.LayoutInflater.from(this).inflate(R.layout.comment_item, commentContainer, false)));
    if (enableColorful()) {
        initCommentItem(this, comment_item, comment, mainSwatch, itemSwatch, false);
    }else {
        initCommentItem(this, comment_item, comment, null, null, false);
    }
    return comment_item;
}
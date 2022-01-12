@java.lang.Override
public void goWriteComment(java.lang.String comment) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.belatrixsf.allstars.ui.comment.CommentActivity.class);
    intent.putExtra(com.belatrixsf.allstars.ui.givestar.GiveStarFragment.COMMENT_KEY, comment);
    startActivityForResult(intent, com.belatrixsf.allstars.ui.givestar.GiveStarFragment.RQ_COMMENT);
}
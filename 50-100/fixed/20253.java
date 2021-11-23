private void openDialog(com.floatingmuseum.mocloud.data.entity.Comment comment) {
    final com.floatingmuseum.mocloud.ui.comments.CommentReplyDialog replyDialog = new com.floatingmuseum.mocloud.ui.comments.CommentReplyDialog(this);
    replyDialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {
        @java.lang.Override
        public void onShow(android.content.DialogInterface dialog) {
            com.orhanobut.logger.Logger.d("对话框弹出");
        }
    });
    replyDialog.show();
}
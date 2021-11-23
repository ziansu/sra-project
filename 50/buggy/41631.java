@java.lang.Override
protected void onClick(android.view.View v, int id) {
    if ((R.id.item_root) == id) {
        com.syberos.yixuntong.client.AttachmentDetailActivity.showDetailList(summary.consid, attachmentInfos, true);
    }
}
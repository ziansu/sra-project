@java.lang.Override
protected void onClick(android.view.View v, int id) {
    if ((R.id.item_root) == id) {
        if ((getItemViewType()) == 1) {
            pickImage();
        }else {
            if (null == (detail)) {
                com.syberos.yixuntong.client.AttachmentDetailActivity.showList(this, adapterPath);
            }else {
                com.syberos.yixuntong.client.AttachmentDetailActivity.showDetailList(this, detail.consid, attachmentInfos, true);
            }
        }
    }
}
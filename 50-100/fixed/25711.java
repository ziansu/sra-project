@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    switch (intent.getAction()) {
        case piotr.fr.sharelist.dialog.TextPickerDialog.EVENT_ON_TEXT_PICKED_UP :
            java.lang.String text = intent.getStringExtra(TextPickerDialog.EXTRA_TEXT);
            addElement(text);
            break;
        case piotr.fr.sharelist.adapter.ShareAdapter.EVENT_DELETE_SHARE :
            piotr.fr.sharelist.pojo.Share share = ((piotr.fr.sharelist.pojo.Share) (intent.getSerializableExtra(ShareAdapter.EXTRA_DELETE_SHARE)));
            askDeleteShare(share);
            break;
        default :
            break;
    }
}
@java.lang.Override
public void onBackPressed() {
    if (((emojiPopup) != null) && (emojiPopup.isShowing())) {
        emojiPopup.dismiss();
    }
    if ((adapter) != null) {
        if ((selectionCount) == 0) {
            super.onBackPressed();
        }
        {
            adapter.unselectAllItems();
        }
    }else {
        super.onBackPressed();
    }
}
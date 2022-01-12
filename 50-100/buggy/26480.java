@java.lang.Override
public void onBackPressed() {
    if (((emojiPopup) != null) && (emojiPopup.isShowing())) {
        emojiPopup.dismiss();
    }
    if ((selectionCount) == 0) {
        super.onBackPressed();
    }
    {
        adapter.unselectAllItems();
    }
}
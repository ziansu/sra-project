@java.lang.Override
public void onClick(android.view.View view) {
    if (!(getSelectMode())) {
        final com.gelakinetic.mtgfam.helpers.DecklistHelpers.CompressedDecklistInfo item = mItems.get(getAdapterPosition());
        showDialog(DecklistDialogFragment.DIALOG_UPDATE_CARD, item.mCard.mName, item.mIsSideboard);
    }
    super.onClick(view);
}
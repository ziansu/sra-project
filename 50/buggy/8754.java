@java.lang.Override
public void onRightButtonClick(java.lang.String... strings) {
    net.hadifar.dope.storage.BundleDataBaseManager.getInstance().removeFromFlashCard(flashCard);
    adapter.removeItem(flashCard);
    adapter.notifyDataSetChanged();
    deleteMsg.dismiss();
}
@java.lang.Override
public void onItemClick(com.orhanobut.dialogplus.DialogPlus dialog, java.lang.Object item, android.view.View view, int position) {
    com.orhanobut.logger.Logger.e("onItemClick is", "sending card to box");
    helper.placeCardInBoxInBackground(adapter.getList().get(boxListPosition).getUserId(), cards.get(position).getImageRef());
    dialog.dismiss();
}
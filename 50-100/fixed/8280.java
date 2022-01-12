@java.lang.Override
public void onItemClick(com.orhanobut.dialogplus.DialogPlus dialog, java.lang.Object item, android.view.View view, int position) {
    helper.placeCardInBoxInBackground(adapter.getList().get(boxListPosition).getUserId(), cards.get(position).getImageRef());
    dialog.dismiss();
}
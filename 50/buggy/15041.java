@java.lang.Override
public void onCompleted(java.lang.Exception e, android.widget.ImageView result) {
    holder.singleGifViewLoading.setVisibility(View.GONE);
    holder.gifChatView.setTag(ink.adapters.ChatAdapter.LOADED);
}
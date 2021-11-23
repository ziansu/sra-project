@java.lang.Override
public void run() {
    android.os.Message message = new android.os.Message();
    message.obj = org.lvu.utils.HttpUtil.getEuropeVideoUrlByUrl(mData.get((((holder.getAdapterPosition()) != 0) && ((holder.getAdapterPosition()) >= (mData.size())) ? (mData.size()) - 1 : holder.getAdapterPosition())).getUrl());
    message.what = org.lvu.adapter.EuropeVideoAdapter.GET_URL;
    dialog.dismiss();
    mHandler.sendMessage(message);
}
@java.lang.Override
public void onClick(android.view.View v) {
    new com.xllllh.android.takeaway.OrderListRecyclerViewAdapter.ChangeOrderStateTask().execute(orderId, Order.STATE_PAYED_ACCEPT);
    try {
        holder.mItem.remove("state");
        holder.mItem.put("state", Order.STATE_PAYED_ACCEPT);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    holder.mStatus.setText("商家已接单");
    holder.mCancel.setVisibility(View.GONE);
    holder.mPay.setVisibility(View.GONE);
    holder.mConfirm.setVisibility(View.VISIBLE);
}
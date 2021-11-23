@java.lang.Override
public void onClick(android.view.View v) {
    new com.xllllh.android.takeaway.OrderListRecyclerViewAdapter.ChangeOrderStateTask().execute(orderId, Order.STATE_CANCEL);
    try {
        holder.mItem.remove("state");
        holder.mItem.put("state", Order.STATE_CANCEL);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    holder.mStatus.setText("订单已取消");
    holder.mCancel.setVisibility(View.GONE);
    holder.mPay.setVisibility(View.GONE);
    holder.mConfirm.setVisibility(View.GONE);
}
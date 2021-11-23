@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    int pos = viewHolder.getAdapterPosition();
    adapter.deleteAddress(pos);
    ((com.ck.taxoteam.taxoclient.adapter.AddressLineAdapter.EditTypeViewHolder) (viewHolder)).editText.setText("");
    if ((activity.markers.get(viewHolder)) != null) {
        activity.markers.get(viewHolder).remove();
        activity.routes.get(viewHolder).remove();
        activity.getRoute();
    }
}
@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    adapter.deleteAddress(viewHolder.getAdapterPosition());
    ((com.example.sveta.taxo.adapter.AddressLineAdapter.EditTypeViewHolder) (viewHolder)).editText.setText("");
    MainActivity.markers.get(viewHolder).remove();
    MainActivity.markers.remove(viewHolder);
}
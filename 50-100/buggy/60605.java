public void setActiveCharacter(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, boolean isActive) {
    if (isActive) {
        viewHolder.itemView.setBackgroundColor(viewHolder.itemView.getResources().getColor(R.color.colorActiveTurn));
    }else {
        viewHolder.itemView.setBackgroundColor(viewHolder.itemView.getResources().getColor(R.color.white));
    }
}
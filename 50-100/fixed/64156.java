private void configureItem(final com.codepath.android.instudy.adapters.LectionListAdapter.ItemLection vh, int position) {
    com.codepath.android.instudy.models.Lection l = mLections.get(position);
    vh.tvLectionName.setText(l.getTitle());
    vh.tvLocation.setText(l.getLocation());
    vh.tvDate.setText(l.getStartDate());
    vh.tvTime.setText(l.getStartTime());
}
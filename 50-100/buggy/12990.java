@java.lang.Override
public void onBindViewHolder(final mem.edu.meaningful.CoordinatorFragment.SimpleStringRecyclerViewAdapter.ViewHolder holder, final int position) {
    holder.mTextView.setText(mValues[position]);
    holder.mView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.support.design.widget.Snackbar.make(v, getValueAt(position), Snackbar.LENGTH_SHORT).show();
        }
    });
}
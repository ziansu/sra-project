@java.lang.Override
public void onBindViewHolder(therabbit.assignmentproject.MyRecyclerViewAdapter.ViewHolder holder, final int position) {
    if (((bitmaps) != null) && ((bitmaps.size()) != 0)) {
        therabbit.assignmentproject.MyRecyclerViewAdapter.ViewHolder viewHolder = ((therabbit.assignmentproject.MyRecyclerViewAdapter.ViewHolder) (holder));
        viewHolder.imageView.setImageBitmap(bitmaps.get(position));
        viewHolder.del.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                android.support.v7.app.AlertDialog diaBox = AskOption(position);
                diaBox.show();
            }
        });
    }
}
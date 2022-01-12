@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    com.jaychang.android.widgets.demo.CellType1.ViewHolder holder1 = ((com.jaychang.android.widgets.demo.CellType1.ViewHolder) (holder));
    holder1.swipeToRevealLayout.close();
    holder1.surfaceView.setText(data);
    holder1.deleteBtn.setText(("delete " + (data)));
    holder1.deleteBtn.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            java.lang.System.out.println(("click:" + (data)));
        }
    });
}
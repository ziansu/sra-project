public void setData(final T data) {
    itemView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            onItemViewClick(data);
        }
    });
}
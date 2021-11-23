public void setData(final T object) {
    itemView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            onItemViewClick(object);
        }
    });
}
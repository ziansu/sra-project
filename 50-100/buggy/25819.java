protected void updateItemClickListener(final int position, android.view.ViewGroup vItem) {
    if ((mOnItemClickListener) != null) {
        final M item = getItem(position);
        vItem.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                mOnItemClickListener.onClick(item, position);
            }
        });
    }
}
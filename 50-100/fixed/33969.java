@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, final int position) {
    final android.view.View itemView = viewCreator.view(container);
    if ((itemClickListener) != null) {
        itemView.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                itemClickListener.onItemClick(null, itemView, position, 0);
            }
        });
    }
    ((com.benny.library.autoadapter.listener.DataChangeListener<T>) (itemView.getTag())).onDataChange(itemAccessor.get(position));
    return itemView;
}
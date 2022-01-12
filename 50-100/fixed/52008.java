private boolean fitNewItem() {
    heightOfAllItems = 0.0;
    for (int i = 0; i < (getItemCount()); i++) {
        if ((container.findViewHolderForAdapterPosition(i)) != null) {
            android.view.View itemView = container.findViewHolderForAdapterPosition(i).itemView;
            heightOfAllItems += itemView.getHeight();
        }
    }
    return ((heightOfAllItems) + (minHeightPX)) <= ((container.getHeight()) - (marginPixels));
}
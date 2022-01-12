@com.ahamed.multiviewadapter.annotation.PositionType
private int getPositionTypeLinear(int itemPosition, int adapterPosition, boolean isReverseLayout) {
    boolean isFirstItem = (isReverseLayout) ? adapter.isLastItemInManager(adapterPosition, itemPosition) : itemPosition == 0;
    boolean isLastItem = (isReverseLayout) ? itemPosition == 0 : adapter.isLastItemInManager(adapterPosition, itemPosition);
    return isFirstItem ? com.ahamed.multiviewadapter.util.ItemDecorator.POSITION_FIRST_ITEM : isLastItem ? com.ahamed.multiviewadapter.util.ItemDecorator.POSITION_LAST_ITEM : com.ahamed.multiviewadapter.util.ItemDecorator.POSITION_MIDDLE_ITEM;
}
@java.lang.Override
public void onClick(android.view.View view) {
    int position = indexOfChild(view);
    if ((onTabItemClickListener) != null) {
        if (((currentSelectedPosition) == position) && (position != 1)) {
            return ;
        }
        onTabItemClickListener.onTabItemClick(indexOfChild(view));
        com.home77.kake.common.widget.bottombar.IBottomItem bottomItem = ((com.home77.kake.common.widget.bottombar.IBottomItem) (view));
        bottomItem.shrink(shrinkAnimation);
    }
    if (position != 1) {
        selectBottomBarItem(position);
    }
}
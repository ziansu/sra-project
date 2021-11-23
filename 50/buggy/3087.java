@java.lang.Override
public int getViewType(int container) {
    switch (container) {
        case VIEW_TYPE_PAGER :
            return VIEW_TYPE_GRID;
        case VIEW_TYPE_LIST :
            return VIEW_TYPE_TILE;
    }
    return super.getViewType(container);
}
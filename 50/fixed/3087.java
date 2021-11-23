@java.lang.Override
public int getViewType(int container) {
    switch (container) {
        case VIEW_TYPE_PAGER :
            return VIEW_TYPE_LIST;
    }
    return super.getViewType(container);
}
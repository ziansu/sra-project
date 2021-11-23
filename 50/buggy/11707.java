@java.lang.Override
public void setLayoutDirection(int layoutDirection) {
    getIcons(((mThemedResources) != null ? mThemedResources : getContext().getResources()));
    super.setLayoutDirection(layoutDirection);
}
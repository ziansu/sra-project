private void init(java.util.List<P> parents) {
    mParents = (parents == null) ? new java.util.ArrayList<P>() : parents;
    mItems = com.github.huajianjiang.expandablerecyclerview.widget.ExpandableAdapters.generateItems(parents);
}
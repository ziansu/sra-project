public atv.model.TreeNode createNode(java.lang.String locationlevel, java.lang.String locationname) {
    atv.model.TreeNode node = new atv.model.TreeNode(locationname, locationlevel).setViewHolder(new atv.holder.SelectableItemHolder(getActivity(), (locationlevel + ": ")));
    node.setSelectable(false);
    addselectlistener(node, "");
    return node;
}
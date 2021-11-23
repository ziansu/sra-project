@java.lang.Override
public void expandTreeItemOnOpen(final org.sagebionetworks.web.client.widget.entity.EntityTreeItem target) {
    if (!(alreadyFetchedEntityChildren.contains(target))) {
        alreadyFetchedEntityChildren.add(target);
        target.showLoadingIcon();
        long childCount = (target == null) ? 0 : target.asTreeItem().getChildCount();
        getFolderChildren(target.getHeader().getId(), target, childCount);
        target.showTypeIcon();
    }
}
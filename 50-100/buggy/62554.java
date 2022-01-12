@java.lang.Override
public java.lang.Object execute(org.eclipse.core.commands.ExecutionEvent event) throws org.eclipse.core.commands.ExecutionException {
    org.eclipse.jface.viewers.IStructuredSelection selection = ((org.eclipse.jface.viewers.IStructuredSelection) (org.eclipse.ui.handlers.HandlerUtil.getCurrentSelection(event)));
    if (selection.isEmpty()) {
        return null;
    }
    try {
        bookmarksService.deleteBookmarks(getAsBookmarkIds(selection));
    } catch (mesfavoris.BookmarksException e) {
        throw new org.eclipse.core.commands.ExecutionException("Could not delete bookmark", e);
    }
    return null;
}
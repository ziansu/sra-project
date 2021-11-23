private void renameList() {
    new cgeo.geocaching.command.RenameListCommand(this, listId) {
        @java.lang.Override
        protected void onFinished() {
            refreshCurrentList();
        }
    }.execute();
}
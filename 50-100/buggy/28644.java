private void resolveMoveConflict(java.lang.String cause) {
    org.eclipse.che.ide.ui.dialogs.choice.ChoiceDialog dialog = dialogFactory.createChoiceDialog("Move conflict", cause, "Rename", "Skip", "Overwrite", new org.eclipse.che.ide.ui.dialogs.ConfirmCallback() {
        @java.lang.Override
        public void accepted() {
            moveWithNewName();
        }
    }, new org.eclipse.che.ide.ui.dialogs.ConfirmCallback() {
        @java.lang.Override
        public void accepted() {
            move();
        }
    }, new org.eclipse.che.ide.ui.dialogs.ConfirmCallback() {
        @java.lang.Override
        public void accepted() {
            moveWithOverwriting();
        }
    });
    dialog.show();
}
private void saveUserInboxStateForUndo() {
    undoStack.push(new project.taskcrusher.model.UserInbox(this.userInbox));
    isLastPerformedActionIsUndo = false;
}
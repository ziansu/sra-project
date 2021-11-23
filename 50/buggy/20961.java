public boolean deleteFirstThreeMessages() {
    goToImportantMessages();
    selectFirstThreeCheckButtons();
    deleteCheckedMessages();
    return true;
}
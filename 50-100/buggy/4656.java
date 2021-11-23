public void displayListenContent(com.lovelybroteam.listenexercise.model.ListenContent listenContent, java.lang.String filePath) {
    this.listenContent = listenContent;
    showConversationDialog(false);
    currentFileName = filePath;
    questionAnswerAdapter.setShowAnswer(false);
    questionAnswerAdapter.setListenContent(listenContent);
    effectImageViewSubmit.setActivated(false);
    refreshView();
}
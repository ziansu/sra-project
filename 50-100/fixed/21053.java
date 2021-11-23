public void addMultipleChoiceQuestion(long id, java.lang.String title, java.util.Map<java.lang.String, android.view.View.OnClickListener> listeners) {
    com.rr.rgem.gem.views.MultipleChoice msg = new com.rr.rgem.gem.views.MultipleChoice(id, new java.util.Date().toString(), true, Message.ResponseType.QuickReply, listeners);
    msg.setTitle(title);
    addQuickButtonQuestion(msg);
}
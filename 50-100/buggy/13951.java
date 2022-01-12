public void addTextInputQuestion(long id, java.lang.String title, android.widget.TextView.OnEditorActionListener listener) {
    com.rr.rgem.gem.views.Message msg = new com.rr.rgem.gem.views.Message(newId(), new java.util.Date().toString(), true, Message.ResponseType.FreeForm, listener);
    msg.setTitle(title);
    addFreeFormQuestion(msg, "Type answer here...");
}
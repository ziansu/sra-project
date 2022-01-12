public void setMessage(com.waz.api.Message message, com.waz.zclient.pages.main.conversation.views.row.separator.Separator separator) {
    setUnreadDot(separator);
    setUserName(message, separator);
    setTimestamp(separator);
    setPadding(message, separator);
    showRecalledGlyph(separator);
    if (message.isEdited()) {
        messageEditedGlyph.setVisibility(View.VISIBLE);
    }else {
        messageEditedGlyph.setVisibility(View.GONE);
    }
}
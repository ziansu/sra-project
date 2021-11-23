private me.ramswaroop.jbot.core.slack.models.RichMessage getTerm(java.lang.String title) {
    me.ramswaroop.jbot.core.slack.models.RichMessage message = new me.ramswaroop.jbot.core.slack.models.RichMessage();
    me.ramswaroop.jbot.core.slack.models.Attachment attachment = new me.ramswaroop.jbot.core.slack.models.Attachment();
    glossarybot.model.Term term = repository.getTerm(title);
    if (term == null) {
        message.setText((("Definition of " + title) + " was not found"));
    }else {
        message.setText(term.getTitle());
        attachment.setText(term.getDescription());
        message.setAttachments(new me.ramswaroop.jbot.core.slack.models.Attachment[]{ attachment });
    }
    return message;
}
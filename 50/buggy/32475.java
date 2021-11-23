public at.fhj.swd13.pse.db.entity.MessageTag removeMessageTag(at.fhj.swd13.pse.db.entity.MessageTag messageTag) {
    getMessageTags().remove(messageTag);
    messageTag.setTag(null);
    return messageTag;
}
@java.lang.Override
public void remove(final net.anfoya.mail.gmail.model.GmailTag tag) throws net.anfoya.mail.gmail.GMailException {
    try {
        labelService.remove(labelService.get(tag.getId()));
    } catch (final net.anfoya.mail.gmail.service.LabelException e) {
        throw new net.anfoya.mail.gmail.GMailException(("remove tag " + (tag.getName())), e);
    }
}
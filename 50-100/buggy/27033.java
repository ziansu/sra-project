@java.lang.Override
public void remove(final net.anfoya.mail.gmail.model.GmailSection section) throws net.anfoya.mail.gmail.GMailException {
    try {
        labelService.remove(labelService.get(section.getId()));
    } catch (final net.anfoya.mail.gmail.service.LabelException e) {
        throw new net.anfoya.mail.gmail.GMailException((("remove section \"" + (section.getName())) + "\""), e);
    }
}
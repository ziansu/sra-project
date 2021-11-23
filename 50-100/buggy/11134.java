public java.util.ArrayList<org.bitbucket.ucchy.undine.MailData> getTrashboxMails(org.bitbucket.ucchy.undine.sender.MailSender sender) {
    if (!(isLoaded)) {
        return null;
    }
    sender.setStringMetadata(org.bitbucket.ucchy.undine.MailManager.MAILLIST_METAKEY, "trashbox");
    java.util.ArrayList<org.bitbucket.ucchy.undine.MailData> box = new java.util.ArrayList<org.bitbucket.ucchy.undine.MailData>();
    for (org.bitbucket.ucchy.undine.MailData mail : mails) {
        if ((mail.isRelatedWith(sender)) && (mail.isSetTrash(sender))) {
            box.add(mail);
        }
    }
    org.bitbucket.ucchy.undine.MailManager.sortNewer(box);
    return box;
}
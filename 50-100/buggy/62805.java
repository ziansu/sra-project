private org.bedework.caldav.util.sharing.InviteNotificationType deletedNotification(final java.lang.String shareeHref, final java.lang.String sharedUrl, final java.lang.String sharerHref) throws org.bedework.calfacade.exc.CalFacadeException {
    final org.bedework.caldav.util.sharing.InviteNotificationType in = new org.bedework.caldav.util.sharing.InviteNotificationType();
    in.setUid(org.bedework.util.misc.Uid.getUid());
    in.setHref(shareeHref);
    in.setInviteStatus(org.bedework.calsvc.Sharing.removeStatus);
    in.setHostUrl(shareeHref);
    final org.bedework.caldav.util.sharing.OrganizerType org = new org.bedework.caldav.util.sharing.OrganizerType();
    org.setHref(sharerHref);
    in.setOrganizer(org);
    return in;
}
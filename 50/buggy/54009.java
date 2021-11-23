@java.lang.Override
public void remove(final org.bedework.calfacade.BwPrincipal pr, final org.bedework.caldav.util.notifications.NotificationType val) throws org.bedework.calfacade.exc.CalFacadeException {
    try {
        pushPrincipal(pr);
        remove(val);
    } finally {
        popPrincipal();
    }
}
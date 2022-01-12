protected final void AdeMaskLog(java.lang.String[] args) {
    try {
        run(args);
    } catch (org.openmainframe.ade.exceptions.AdeUsageException e) {
        getMessageHandler().handleUserException(e);
    } catch (org.openmainframe.ade.exceptions.AdeInternalException e) {
        getMessageHandler().handleAdeInternalException(e);
    } catch (org.openmainframe.ade.exceptions.AdeException e) {
        getMessageHandler().handleAdeException(e);
    } catch (java.lang.Exception e) {
        getMessageHandler().handleUnexpectedException(e);
    } finally {
        quietCleanup();
    }
}
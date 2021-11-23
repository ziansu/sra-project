public void run() {
    while (true) {
        net.engio.mbassy.bus.IMessagePublication publication = null;
        try {
            publication = pendingMessages.take();
            publication.execute();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            return ;
        } catch (java.lang.Throwable t) {
            handlePublicationError(new net.engio.mbassy.bus.error.InternalPublicationError(t, "Error in asynchronous dispatch", publication));
        }
    } 
}
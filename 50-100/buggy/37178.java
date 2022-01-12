@java.lang.Override
public void handleNanopub(org.nanopub.Nanopub np) {
    try {
        if (!(reuseStopped)) {
            processIndexNanopub(np);
        }
    } catch (java.io.IOException ex) {
        throw new java.lang.RuntimeException(ex);
    } catch (org.openrdf.rio.RDFHandlerException ex) {
        throw new java.lang.RuntimeException(ex);
    } catch (org.nanopub.MalformedNanopubException ex) {
        throw new java.lang.RuntimeException(ex);
    }
}
public static void createSpaceOntology() throws me.aatma.library.sapi.exception.CreateException, me.aatma.library.sapi.exception.SapiTypeException {
    me.aatma.library.sapi.jenasclient.SObjectImpl.getDataset().begin(ReadWrite.WRITE);
    java.lang.String spaceNs = (me.aatma.library.sapi.jenasclient.Constants.TBOX_PART) + "Space#";
    me.aatma.library.sapi.Context spaceCtx = new me.aatma.library.sapi.jenasclient.ContextImpl(spaceNs);
    me.aatma.library.sapi.SCollection location = me.aatma.library.sapi.jenasclient.SCollectionImpl.findOrCreate((spaceNs + "Location"), spaceCtx);
    location.addLabel("Location", spaceCtx);
    location.addGeneralization(OWL_S.Thing, spaceCtx);
    me.aatma.library.sapi.jenasclient.SObjectImpl.getDataset().commit();
    me.aatma.library.sapi.jenasclient.SObjectImpl.getDataset().end();
}
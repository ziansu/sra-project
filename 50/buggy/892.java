private void addEnclosingMethodIfAvailable() {
    java.lang.System.out.println(currentCtx.toString());
    cc.recommenders.assertions.Asserts.assertNotNull(currentCtx);
    events.add(cc.kave.commons.model.episodes.Events.newContext(currentCtx));
    currentCtx = null;
}
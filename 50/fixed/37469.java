public void onStartup(@javax.enterprise.event.Observes
br.com.caelum.vraptor.events.VRaptorInitialized init) {
    if ((environment.supports("solr.syncOnStartup")) && (environment.supports("feature.solr"))) {
        execute();
    }
}
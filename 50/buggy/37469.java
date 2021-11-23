@br.com.caelum.vraptor.Post(value = "/akwiqeojovndfasf0asf0s9ad8fas9d12io3nwo120")
public void onStartup(@javax.enterprise.event.Observes
br.com.caelum.vraptor.events.VRaptorInitialized init) {
    if ((environment.supports("solr.syncOnStartup")) && (environment.supports("feature.solr"))) {
        indexSync();
    }
}
@javax.inject.Inject
public void configureScheduler(@edu.dfci.cccb.mev.dataset.domain.r.annotation.Rserve
int concurrency) {
    dispatcher = java.util.concurrent.Executors.newFixedThreadPool(2);
}
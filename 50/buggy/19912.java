@javax.annotation.PostConstruct
public void init() {
    cz.ivoa.vocloud.ejb.SchedulerBean.logger.log(java.util.logging.Level.INFO, "scheduler initialized");
    watchedJobs.addAll(jf.findByPhase(Phase.EXECUTING));
    updateExecutingJobs();
}
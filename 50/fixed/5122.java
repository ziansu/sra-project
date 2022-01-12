@javax.annotation.PostConstruct
public void init() {
    org.infinispan.wfink.web.JsfController.LOGGER.info(("CacheManager : custer=" + (manager.getClusterName())));
    initForm();
}
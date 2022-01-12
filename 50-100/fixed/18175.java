@java.lang.Override
public void plan(io.apiman.manager.api.beans.plans.PlanBean plan) {
    currentPlan = plan;
    try {
        logger.info(((Messages.i18n.format("StorageImportDispatcher.ImportingPlan")) + (plan.getName())));
        plan.setOrganization(currentOrg);
        storage.createPlan(plan);
    } catch (io.apiman.manager.api.core.exceptions.StorageException e) {
        error(e);
    }
}
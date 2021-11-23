@org.kohsuke.accmod.Restricted(value = org.kohsuke.accmod.restrictions.NoExternalUse.class)
public hudson.plugins.promoted_builds.Status getStatus(hudson.plugins.promoted_builds.PromotionProcess process) {
    java.util.List<hudson.plugins.promoted_builds.Promotion> list = getPromotions(process);
    hudson.plugins.promoted_builds.Promotion latest = ((list.size()) > 0) ? list.get(((list.size()) - 1)) : null;
    hudson.plugins.promoted_builds.Status status = (latest != null) ? latest.getStatus() : null;
    return status;
}
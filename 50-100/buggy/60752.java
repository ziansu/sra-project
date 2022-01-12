public java.util.List<hudson.plugins.promoted_builds.Promotion> getPromotionsSummary(hudson.plugins.promoted_builds.PromotionProcess promotionProcess) {
    java.util.List<hudson.plugins.promoted_builds.Promotion> promotionList = this.getPromotions(promotionProcess);
    if ((promotionList.size()) > (hudson.plugins.promoted_builds.PromotedProjectAction.SUMMARY_SIZE)) {
        return promotionList.subList(0, hudson.plugins.promoted_builds.PromotedProjectAction.SUMMARY_SIZE);
    }else {
        return promotionList;
    }
}
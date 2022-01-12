@java.lang.Override
public java.lang.String apply(@javax.annotation.Nullable
hudson.plugins.promoted_builds.integrations.jobdsl.PromotionContext input) {
    if (input != null) {
        return input.getName();
    }
    throw new java.lang.NullPointerException("PromotionsContext.promotionContexts is not expected to contain null elements");
}
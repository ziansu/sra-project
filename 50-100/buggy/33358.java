public play.mvc.Result updateSubscription() {
    models.CourseSubscription subscription = play.data.Form.form(models.CourseSubscription.class).bindFromRequest().get();
    if (subscriptionValidator.isValid(subscription)) {
        models.CourseSubscription subscriptionToUpdate = subscriptionDAO.read(subscription.getSubscriptionId());
        subscriptionToUpdate.setPayed(subscription.isPayed());
        subscriptionDAO.update(subscriptionToUpdate, subscription.getSubscriptionId());
        return getDefaultSubscriptionPageResult();
    }
    return getMessagedSubscriptionPageResult("Could not update subscription. Bad credentials.");
}
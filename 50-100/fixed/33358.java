public play.mvc.Result updateSubscription() {
    models.CourseSubscription subscription = play.data.Form.form(models.CourseSubscription.class).bindFromRequest().get();
    models.CourseSubscription subscriptionToUpdate = subscriptionDAO.read(subscription.getSubscriptionId());
    subscriptionToUpdate.setPayed(subscription.isPayed());
    subscriptionDAO.update(subscriptionToUpdate, subscription.getSubscriptionId());
    return getDefaultSubscriptionPageResult();
}
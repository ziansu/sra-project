public void destroyController(java.lang.String id) {
    java.lang.Object controller = controllers.remove(id);
    java.lang.Class controllerClass = controllerClassMapping.remove(id);
    containerManager.destroyController(controller, controllerClass);
    java.lang.Object model = models.remove(id);
    if (model != null) {
        beanRepository.delete(model);
    }
    com.canoo.dolphin.event.Subscription subscription = mBeanSubscriptions.remove(id);
    if (subscription != null) {
        subscription.unsubscribe();
    }
}
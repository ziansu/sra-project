public net.thucydides.core.steps.StepEventBus registerListener(final net.thucydides.core.steps.StepListener listener) {
    if (!(registeredListeners.contains(listener))) {
        registeredListeners.add(listener);
        if (net.thucydides.core.steps.BaseStepListener.class.isAssignableFrom(listener.getClass())) {
            baseStepListener = ((net.thucydides.core.steps.BaseStepListener) (listener));
            baseStepListener.setEventBus(this);
        }
    }
    return this;
}
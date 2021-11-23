private void init() {
    if ((!(initialized)) && ((beanManager()) != null)) {
        synchronized(this) {
            if ((!(initialized)) && ((beanManager()) != null)) {
                elResolver.setDelegate(beanManager().getELResolver());
                initialized = true;
            }
        }
    }
}
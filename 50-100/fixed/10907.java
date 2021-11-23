private void init() {
    if (!(initialized)) {
        synchronized(this) {
            if (!(initialized)) {
                if ((beanManager()) != null) {
                    elResolver.setDelegate(beanManager().getELResolver());
                }
                initialized = true;
            }
        }
    }
}
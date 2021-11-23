public void start() {
    if (!(lazyMode)) {
        if (!(((itemProperty().getValue()) != null) || ((beanProperty().getValue()) != null))) {
            reSchedule(null);
        }
    }
}
protected java.lang.Throwable triggerForegroundEventsWithError() {
    try {
        triggerForegroundEvents("");
    } catch (com.ncornette.rx.test.RxTestSchedulers.OnErrorEventsException e) {
        return e.getCause();
    }
    return null;
}
@java.lang.Override
protected final void onProgressUpdate(Progress... values) {
    if ((values == null) || ((values.length) == 0)) {
        deferred.notify(null);
    }else
        if ((values.length) > 1) {
            log.warn("There were multiple progress values.  Only the first one was used!");
            deferred.notify(values[0]);
        }
    
}
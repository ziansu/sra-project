@java.lang.Override
public void done(playn.core.Image resource) {
    (loadedElements)++;
    eventlistener.onPercentUpdate(((totalElements) / (loadedElements)));
}
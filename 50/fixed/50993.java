@java.lang.Override
public void setTimeAxisScale(org.mpilone.vaadin.timeline.TimeAxisScale scale) {
    getState().options.timeAxis.scale = (scale == null) ? null : scale.name().toLowerCase();
}
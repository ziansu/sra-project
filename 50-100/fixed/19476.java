public javafx.beans.property.ObjectProperty<javafx.scene.paint.Color> thresholdColorProperty() {
    if (null == (thresholdColor)) {
        thresholdColor = new javafx.beans.property.ObjectPropertyBase<javafx.scene.paint.Color>(_thresholdColor) {
            @java.lang.Override
            protected void invalidated() {
                fireUpdateEvent(REDRAW_EVENT);
            }

            @java.lang.Override
            public java.lang.Object getBean() {
                return eu.hansolo.medusa.Gauge.this;
            }

            @java.lang.Override
            public java.lang.String getName() {
                return "thresholdColor";
            }
        };
        _thresholdColor = null;
    }
    return thresholdColor;
}
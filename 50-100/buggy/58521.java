public javafx.beans.property.ObjectProperty<eu.hansolo.medusa.TickLabelLocation> tickLabelLocationProperty() {
    if (null == (tickLabelLocation)) {
        tickLabelLocation = new javafx.beans.property.ObjectPropertyBase<eu.hansolo.medusa.TickLabelLocation>() {
            @java.lang.Override
            protected void invalidated() {
                if (null == (get()))
                    set(TickLabelLocation.INSIDE);
                
                fireUpdateEvent(REDRAW_EVENT);
            }

            @java.lang.Override
            public java.lang.Object getBean() {
                return eu.hansolo.medusa.Gauge.this;
            }

            @java.lang.Override
            public java.lang.String getName() {
                return "tickLabelLocation";
            }
        };
        _tickLabelLocation = null;
    }
    return tickLabelLocation;
}
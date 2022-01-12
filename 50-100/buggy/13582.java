public org.openbase.bco.bcozy.view.InfoPane.InfoPaneConfigurer hideAfter(javafx.util.Duration duration) {
    com.sun.javafx.application.PlatformImpl.runLater(() -> {
        try {
            org.openbase.bco.bcozy.view.InfoPane.getInstance().resetTimeline();
        } catch (org.openbase.jul.exception.NotAvailableException ex) {
            org.openbase.jul.exception.printer.ExceptionPrinter.printHistory("Could not print user feedback!", ex, org.openbase.bco.bcozy.view.InfoPane.LOGGER);
        }
        javafx.animation.Timeline timeline = new javafx.animation.Timeline(new javafx.animation.KeyFrame(duration, ( e) -> org.openbase.bco.bcozy.view.InfoPane.hide()));
        timeline.play();
    });
    return this;
}
public void startAutoRefresh() {
    javafx.animation.Timeline autoRefresh = new javafx.animation.Timeline(new javafx.animation.KeyFrame(javafx.util.Duration.seconds(30), new javafx.event.EventHandler<javafx.event.ActionEvent>() {
        @java.lang.Override
        public void handle(javafx.event.ActionEvent event) {
            if (autoRefreshEnabled.getValue())
                service.restart();
            
        }
    }));
    autoRefresh.setCycleCount(javafx.animation.Timeline.INDEFINITE);
    autoRefresh.play();
}
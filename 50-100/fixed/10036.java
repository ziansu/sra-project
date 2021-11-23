private javafx.scene.text.Text createSummaryText() {
    summaryText = new javafx.scene.text.Text(appointment.getSummary());
    summaryText.getStyleClass().add("AppointmentLabel");
    summaryText.setX(layoutHelp.paddingProperty.get());
    summaryText.setY(summaryText.prefHeight(0));
    layoutHelp.clip(this, summaryText, widthProperty().subtract(layoutHelp.paddingProperty), heightProperty().subtract(0.0), true);
    return summaryText;
}
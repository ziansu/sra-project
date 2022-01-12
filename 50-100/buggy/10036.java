private javafx.scene.text.Text createSummaryText() {
    summaryText = new javafx.scene.text.Text(appointment.getSummary());
    summaryText.getStyleClass().add("AppointmentLabel");
    summaryText.setX(layoutHelp.paddingProperty.get());
    summaryText.setY(summaryText.prefHeight(0));
    layoutHelp.clip(summaryText, widthProperty().subtract(layoutHelp.paddingProperty.get()), heightProperty());
    return summaryText;
}
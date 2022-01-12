protected void fillDefaultValues(com.autonomyway.model.Node node) {
    if ((node != null) && (node.hasRecurrentValues())) {
        cashInput.setCash(node.getRecurrentCash());
        durationInput.setDuration(node.getRecurrentDuration());
    }
}
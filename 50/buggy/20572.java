public void handleStatusUpdate(org.json.JSONObject obj) {
    java.lang.System.out.println(("Status update: " + obj));
    int newStatus = obj.getInt("makingProgress");
    if (newStatus != (predictions.ADocumentPredictionManager.currentStatus)) {
        predictions.ADocumentPredictionManager.currentStatus = newStatus;
    }
}
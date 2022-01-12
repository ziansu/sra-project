@java.lang.Override
public void taskCompleted(boolean success, java.lang.String message, org.json.JSONObject json) {
    java.util.List<uk.ac.ncl.csc2022.t14.bankingapp.models.HeatPoint> allPoints = new java.util.ArrayList<>();
    if (success && (responseParser.parseLoadHeatPoints(json, allPoints))) {
        delegate.loadHeatMapPassed(allPoints);
    }else {
        message = responseParser.parseErrorOrDefault(message);
        delegate.loadHeatMapFailed(message);
    }
}
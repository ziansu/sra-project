boolean areNodesWorking() {
    if (((com.telenav.sdk_sample.ui.Header.AutopilotStatusDecisions.statusObject.gettingPerceptionData()) && (com.telenav.sdk_sample.ui.Header.AutopilotStatusDecisions.statusObject.gettingControlData())) && (com.telenav.sdk_sample.ui.Header.AutopilotStatusDecisions.statusObject.gettingLaneData())) {
        return true;
    }else {
        setStatus(com.telenav.sdk_sample.ui.Header.AutopilotStatusDecisions.NODES_NOT_WORKING);
        return true;
    }
}
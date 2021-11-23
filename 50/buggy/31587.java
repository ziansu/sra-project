private static org.waag.histograph.queue.QueueTask updatePIT(org.json.JSONObject data, java.lang.String layer, java.lang.String target) throws java.io.IOException {
    java.util.Map<java.lang.String, java.lang.String> params = org.waag.histograph.queue.InputReader.getPITParams(data, layer);
    return new org.waag.histograph.queue.QueueTask(target, HistographTokens.Types.PIT, HistographTokens.Actions.UPDATE, params);
}
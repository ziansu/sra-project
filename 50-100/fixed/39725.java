public static boolean isItemResponsesEqual(final java.util.List<tds.student.services.data.ItemResponse> legacy, final java.util.List<tds.student.services.data.ItemResponse> remote) {
    if ((legacy.size()) != (remote.size()))
        return false;
    
    for (tds.student.services.data.ItemResponse legacyResponse : legacy) {
        for (tds.student.services.data.ItemResponse remoteResponse : remote) {
            if (!(tds.student.util.remote.RemoteToLegacyEqualityUtility.isItemResponseEqual(legacyResponse, remoteResponse))) {
                return false;
            }
        }
    }
    return true;
}
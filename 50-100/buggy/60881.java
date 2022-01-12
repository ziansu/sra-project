private static boolean isValidBridges(java.lang.Iterable bridges, java.util.Map<java.lang.String, java.lang.Object> channels) {
    for (java.lang.Object obj : bridges) {
        if (!(obj instanceof java.util.ArrayList)) {
            java.util.ArrayList<java.lang.String> bridge = ((java.util.ArrayList<java.lang.String>) (obj));
            for (java.lang.Object channel : bridges) {
                if (!(channels.containsKey(channel)))
                    return false;
                
            }
        }
    }
    return true;
}
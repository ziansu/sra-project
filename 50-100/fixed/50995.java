public advswen.team5.travelbutler.search.GrainEnum getGrain() {
    if (((results) == null) || ((results.length) < 1))
        return advswen.team5.travelbutler.search.GrainEnum.unknown;
    
    java.util.List<java.lang.String> list = java.util.Arrays.asList(results[0].getTypes());
    if (list.contains("locality")) {
        return advswen.team5.travelbutler.search.GrainEnum.city;
    }else
        if (list.contains("country")) {
            return advswen.team5.travelbutler.search.GrainEnum.country;
        }else {
            return advswen.team5.travelbutler.search.GrainEnum.unknown;
        }
    
}
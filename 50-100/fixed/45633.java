public void fromMap(java.util.Map<java.lang.String, java.lang.Object> map) {
    if (!(map.containsKey("distance"))) {
        throw new java.lang.IllegalArgumentException("The input map is invalid");
    }
    if ((map.get("distance")) instanceof java.lang.Integer) {
        distance = 1.0 * ((int) (map.get("distance")));
    }else {
        distance = ((double) (map.get("distance")));
    }
}
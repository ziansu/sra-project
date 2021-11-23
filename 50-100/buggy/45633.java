public void fromMap(java.util.Map<java.lang.String, java.lang.Object> map) {
    if (!(map.containsKey("distance"))) {
        throw new java.lang.IllegalArgumentException("The input map is invalid");
    }
    distance = ((double) (map.get("distance")));
}
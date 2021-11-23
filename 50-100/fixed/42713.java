public java.util.Map<java.lang.String, java.lang.Integer> computeWordFrequencies(java.util.List<java.lang.String> input) {
    java.util.HashMap<java.lang.String, java.lang.Integer> res = new java.util.HashMap();
    if ((input == null) || (input.isEmpty())) {
        return res;
    }
    for (java.lang.String token : input) {
        res.put(token, ((res.getOrDefault(token, 0)) + 1));
    }
    return res;
}
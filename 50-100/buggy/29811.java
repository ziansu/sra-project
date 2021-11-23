public java.lang.String getProperSample(java.lang.String str) {
    java.lang.String sample = str;
    for (int key : groups.keySet()) {
        java.lang.String temp = ("(" + (groups.get(key).replace("\\", "\\\\\\\\"))) + ")";
        sample = sample.replaceAll(("\\\\" + key), temp);
    }
    java.lang.System.out.println(sample);
    return sample;
}
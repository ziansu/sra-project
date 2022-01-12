public java.lang.Integer getStatValue(java.lang.String Name) {
    java.lang.Integer value = 0;
    for (com.hazyfutures.spritestable.Stats stat : pvStats) {
        if (stat.getStatName().toUpperCase().equals(Name.toUpperCase())) {
            value = stat.getStatValue();
            break;
        }
    }
    return value;
}
public java.lang.String optionsToString() {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    b.append(index).append("\n");
    b.append(heightLevel).append("\n");
    b.append(oceanLevel).append("\n");
    b.append(getOceanReplacement()).append("\n");
    b.append(cloudLevel).append("\n");
    b.append((geostrataGen ? 1 : 0));
    return b.toString();
}
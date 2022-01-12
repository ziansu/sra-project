static codng.hgx.Id parse(java.lang.String s) {
    final java.lang.String[] parts = s.split(":");
    if ((parts.length) != 2) {
        throw new java.lang.IllegalArgumentException(("Cannot parse: " + s));
    }
    return new codng.hgx.Id(java.lang.Long.parseLong(parts[0]), parts[1]);
}
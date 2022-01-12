public static com.fasterxml.jackson.annotation.JsonFormat.Features construct(com.fasterxml.jackson.annotation.JsonFormat.Feature[] enabled, com.fasterxml.jackson.annotation.JsonFormat.Feature[] disabled) {
    int e = 0;
    for (com.fasterxml.jackson.annotation.JsonFormat.Feature f : enabled) {
        e |= 1 << (f.ordinal());
    }
    int d = 0;
    for (com.fasterxml.jackson.annotation.JsonFormat.Feature f : enabled) {
        d |= 1 << (f.ordinal());
    }
    return new com.fasterxml.jackson.annotation.JsonFormat.Features(e, d);
}
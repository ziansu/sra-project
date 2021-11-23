public java.lang.String toString(char delimiter) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (Pupil p : pupillist) {
        sb.append(p.toString(delimiter));
        sb.append(((((((schooldes) + delimiter) + (name)) + delimiter) + (kvname)) + delimiter));
        sb.append('\n');
    }
    return sb.toString();
}
@java.lang.Override
public java.lang.String toString() {
    return java.lang.String.format(java.util.Locale.ENGLISH, "%f,%f,%f", threshold, predictionRate(), accuracy());
}
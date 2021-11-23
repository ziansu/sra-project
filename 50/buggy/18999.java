@java.lang.Override
public int compareTo(Triangle other) {
    double compareDepth = other.getCentreZDepth();
    return ((int) ((centreZDepth) - compareDepth));
}
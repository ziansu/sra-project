@java.lang.Override
public int compareTo(Triangle other) {
    double compareDepth = other.getCentreZDepth();
    if (compareDepth == (centreZDepth)) {
        return 1;
    }
    return ((int) ((centreZDepth) - compareDepth));
}
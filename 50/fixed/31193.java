@java.lang.Override
public java.util.ArrayList<java.lang.String> reportDenseFeatures(int index) {
    denseFeatureIndex = index;
    final java.util.ArrayList<java.lang.String> names = new java.util.ArrayList<java.lang.String>(1);
    names.add(name);
    return names;
}
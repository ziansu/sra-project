@java.lang.Override
protected void generatePointImpl(java.nio.FloatBuffer buffer) {
    while (!(contains(buffer))) {
        random(buffer);
    } 
}
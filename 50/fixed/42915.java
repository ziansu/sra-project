@java.lang.Override
protected void generatePointImpl(java.nio.FloatBuffer buffer) {
    do {
        random(buffer);
    } while (!(contains(buffer)) );
}
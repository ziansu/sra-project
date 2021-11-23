private static void createInstance(java.io.File f, org.fbb.balkna.model.WavPlayerProvider wpp) {
    org.fbb.balkna.model.Model.ModelHolder.INSTANCE = new org.fbb.balkna.model.Model(f, wpp);
}
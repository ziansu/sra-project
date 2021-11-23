public static void main(java.lang.String[] args) {
    try {
        new com.truthbean.jeetb.utils.server.GlassfishUtils().run();
    } catch (org.glassfish.embeddable.GlassFishException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
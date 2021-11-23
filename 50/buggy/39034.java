public static void main(java.lang.String[] args) {
    try {
        new com.truthbean.jeetb.utils.server.GlassfishUtils().run(9590);
    } catch (org.glassfish.embeddable.GlassFishException e) {
        e.printStackTrace();
    }
}
private static void utf8() {
    try {
        java.lang.System.setProperty("file.encoding", "UTF-8");
        java.lang.reflect.Field charset = java.nio.charset.Charset.class.getDeclaredField("defaultCharset");
        charset.setAccessible(true);
        charset.set(null, null);
    } catch (java.lang.SecurityException e) {
    } catch (java.lang.NoSuchFieldException e) {
    } catch (java.lang.IllegalArgumentException e) {
    } catch (java.lang.IllegalAccessException e) {
    }
}
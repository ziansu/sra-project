private static java.lang.Object fromString(java.lang.String s) {
    if (s != null) {
        try {
            byte[] data = biz.source_code.base64Coder.Base64Coder.decode(s);
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(data));
            java.lang.Object o = ois.readObject();
            ois.close();
            return o;
        } catch (java.lang.ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return null;
}
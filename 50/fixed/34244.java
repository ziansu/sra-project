final int getBytes() {
    if ((getData()) == null) {
        return 0;
    }else {
        return getData().getBytes(java.nio.charset.Charset.forName("UTF-8")).length;
    }
}
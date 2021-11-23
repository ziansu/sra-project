public static org.jfree.chart.encoders.ImageEncoder newInstance(java.lang.String format) {
    org.jfree.chart.encoders.ImageEncoder imageEncoder = null;
    java.lang.String className = org.jfree.chart.encoders.ImageEncoderFactory.encoders.get(format);
    if (className == null) {
        throw new java.lang.IllegalArgumentException(("Unsupported image format - " + format));
    }
    try {
        java.lang.Class imageEncoderClass = java.lang.Class.forName(className);
        imageEncoder = ((org.jfree.chart.encoders.ImageEncoder) (imageEncoderClass.newInstance()));
    } catch (java.lang.Exception e) {
        throw new java.lang.IllegalArgumentException(e.toString());
    }
    return imageEncoder;
}
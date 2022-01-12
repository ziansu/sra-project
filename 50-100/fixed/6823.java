public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.thoughtworks.xstream.XStream xs = new com.thoughtworks.xstream.XStream();
    xs.processAnnotations(xstream.xstream_class_22.class);
    java.lang.System.out.println("Unmarshalling:");
    java.lang.System.out.println(xs.fromXML(new java.io.File("in.xml")));
    java.lang.System.out.println("Marshalling:");
}
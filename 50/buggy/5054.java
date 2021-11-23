public static void main(java.lang.String[] args) {
    final net.jees.spark.stub.BookingService bookingService = new net.jees.spark.stub.BookingService();
    externalStaticFileLocation("index.html");
    staticFiles.location("/");
    port(1337);
}
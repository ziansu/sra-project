public static void main(java.lang.String[] args) {
    java.util.List<Coordinate<java.lang.Double>> test = MercatorMapping.MM(args[0], true);
    java.lang.System.out.println(((">> The mapped data has " + (test.size())) + " entries."));
    java.lang.System.out.println(">> The mapped data has COM: ");
    java.lang.System.out.println(List_ops.getCOM(test));
    java.lang.System.out.println(">> The mapped data contains:");
    List_ops.print_coordlist_double(test);
}
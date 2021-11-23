public static void main(java.lang.String[] args) {
    java.util.List<Coordinate<java.lang.Double>> test = ParseData.PD(args[0], true);
    java.lang.System.out.println(((">> The parsed data has " + (test.size())) + " entries."));
    java.lang.System.out.println(">> The parsed data contains:");
    List_ops.print_coordlist_double(test);
}
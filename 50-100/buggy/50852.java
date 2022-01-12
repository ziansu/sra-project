public static void orderPrinter(List<Food> x) {
    while ((x.size()) > 0) {
        java.lang.System.out.println(x.remove(0));
        if ((x.size()) > 0) {
            Runner.orderPrinter(x);
        }else {
        }
    } 
}
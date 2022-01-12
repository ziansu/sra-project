public static void listToString(java.util.ArrayList<packingRectangles.Rectangle> list) {
    while (!(list.isEmpty())) {
        java.lang.System.out.println((((list.get(0).getHeight()) + " ") + (list.get(0).getWidth())));
        list.remove(0);
    } 
}
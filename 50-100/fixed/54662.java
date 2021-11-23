public static void listToString(java.util.ArrayList<packingRectangles.Rectangle> list) {
    int i = 0;
    while (i != (list.size())) {
        java.lang.System.out.println((((list.get(i).getHeight()) + " ") + (list.get(i).getWidth())));
        i++;
    } 
}
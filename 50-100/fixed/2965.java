public static void printTriangle(int size) {
    int i = 0;
    while (true) {
        if (i >= size) {
            break;
        }
        PrintingLikeBoss.printWhitespaces((size - (i + 1)));
        PrintingLikeBoss.printStars((i + 1));
        i++;
    } 
}
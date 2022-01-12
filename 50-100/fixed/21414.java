public static void xmasTree(int height) {
    int i = 0;
    while (true) {
        if (i >= height) {
            break;
        }
        PrintingLikeBoss.printWhitespaces((height - (i + 1)));
        PrintingLikeBoss.printStars(((2 * i) + 1));
        i++;
    } 
    PrintingLikeBoss.printWhitespaces((height - 2));
    PrintingLikeBoss.printStars(3);
    PrintingLikeBoss.printWhitespaces((height - 2));
    PrintingLikeBoss.printStars(3);
}
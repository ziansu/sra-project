public static void xmasTree(int height) {
    int treeSize = height;
    int star = 1;
    int treeHeight = 0;
    while (treeHeight < treeSize) {
        PrintingLikeBoss.printWhitespaces(height);
        PrintingLikeBoss.printStars(star);
        star += 2;
        height--;
        treeHeight++;
    } 
    int x = 0;
    while (x < 2) {
        PrintingLikeBoss.printWhitespaces((treeSize - 1));
        PrintingLikeBoss.printStars(3);
        x++;
    } 
}
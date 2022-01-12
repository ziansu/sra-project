public static void printTriangle(int size) {
    int numberStars = 1;
    int num = 0;
    int triangleSize = size;
    while (num < triangleSize) {
        PrintingLikeBoss.printWhitespaces(size);
        PrintingLikeBoss.printStars(numberStars);
        num++;
        size--;
        numberStars++;
    } 
}
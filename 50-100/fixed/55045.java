public static int problemSeven(int max) {
    boolean[] list = sieveOfErathosthenes(109999);
    int count = 0;
    int index = 2;
    while ((count < max) && (index < ((list.length) - 1))) {
        if ((list[index]) == false) {
            count++;
        }
        index++;
    } 
    return index - 1;
}
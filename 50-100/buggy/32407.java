public static void printConsole(int[] data) {
    if (!(utils.arrays.Output.canPrint(data))) {
        return ;
    }
    java.lang.System.out.println("Array:");
    java.lang.System.out.print("[");
    for (int i = 0; i < ((data.length) - 1); i++) {
        java.lang.System.out.print(((data[i]) + ", "));
    }
    java.lang.System.out.print(((data[((data.length) - 1)]) + "]"));
}
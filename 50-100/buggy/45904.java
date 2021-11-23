public static void main(java.lang.String[] args) {
    int[] data = new int[]{ 5 , 4 , 3 , 2 , 1 };
    pl.java.recruitmenttask.app.sort.Sorter sorter = new pl.java.recruitmenttask.app.sort.Sorter(false);
    sorter.trigger(data);
    java.lang.System.out.printf("Results:");
    for (int i = 0; i < (data.length); ++i) {
        java.lang.System.out.printf("\t%d", data[i]);
    }
    java.lang.System.out.println("");
}
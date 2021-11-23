public void PrintCmd() {
    java.lang.System.out.print('\n');
    for (int i = 0; i < 64; i++) {
        if (((i % (stride)) == 0) && (i != 0)) {
            java.lang.System.out.print('\n');
        }
        java.lang.System.out.print(board_data[i]);
    }
    java.lang.System.out.print('\n');
    java.lang.System.out.print('\n');
}
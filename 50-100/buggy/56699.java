public static void main(java.lang.String[] args) {
    int[] a = new int[]{ 0 , 0 , 0 , 1 , 3 , 12 , 0 , 0 };
    jz.Util.printArray(a);
    jz.lc.easy.MoveZeroes.moveZeroes(a);
    jz.Util.printArray(a);
}
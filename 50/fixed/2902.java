public static void main(java.lang.String[] args) {
    if ((args.length) > 0) {
        ReadImage r1 = new ReadImage(args[0]);
        java.lang.System.out.println(r1.getDimension());
        java.lang.System.out.println(r1);
    }
}
public static void main(java.lang.String[] args) {
    RunningMedian x = new RunningMedian();
    for (int i = 0; i < (args.length); i++) {
        x.add(java.lang.Integer.parseInt(args[i]));
        x.debug();
    }
    java.lang.System.out.println(x.getMedian());
}
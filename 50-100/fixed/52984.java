public void readInput() {
    java.lang.System.out.print("Controller: ");
    java.util.Scanner s = new java.util.Scanner(java.lang.System.in);
    java.lang.String input = s.nextLine().trim();
    if (!(input.isEmpty())) {
        mModel.setData(input);
    }
}
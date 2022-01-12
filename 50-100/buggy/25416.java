public void runShell() {
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    while (mIsActive) {
        java.lang.System.out.print(((this.toString()) + '>'));
        mInputs = input.nextLine().split(" ");
        parseInput();
    } 
    input.close();
}
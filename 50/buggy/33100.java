public Model.Player generatePlayer() {
    java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Enter your PlayerName:");
    return new Model.Player(in.nextLine());
}
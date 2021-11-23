public Model.Player generatePlayer(int id) {
    java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Enter your PlayerName:");
    return new Model.Player(id, in.nextLine());
}
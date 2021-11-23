public com.teamtreehouse.jargame.User createUser() throws java.io.IOException {
    java.lang.System.out.println("Please enter the user's name:");
    java.lang.String name = br.readLine();
    return new com.teamtreehouse.jargame.User(name, (-1));
}
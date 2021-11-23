public static void main(java.lang.String[] args) {
    com.epam.util.ObjectBuilder objectBuilder = new com.epam.util.ObjectBuilder();
    com.epam.model.Users users = ((com.epam.model.Users) (objectBuilder.buildObject(com.epam.model.Users.class, "users.xml")));
    for (com.epam.model.User u : users) {
        java.lang.System.out.println((u + ":"));
        for (com.epam.model.Car car : u) {
            java.lang.System.out.println(("\t\t" + car));
        }
    }
}
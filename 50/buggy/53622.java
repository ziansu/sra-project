public static void main(java.lang.String[] args) {
    com.alex.PersonManager personManager = new com.alex.PersonManager();
    com.alex.Person person = personManager.updateFirstName(1, "Jack");
    java.lang.System.out.println(person.toString());
}
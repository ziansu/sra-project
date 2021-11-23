public static void main(java.lang.String[] args) {
    User U = new User();
    U.register("Cody", "Password");
    U = new Resident(U.userName, U.passWord);
    U.verifyLogin("Cody", "Password");
}
public Wasserman.Zachary.Project2ATM.User getUser(int pin) {
    for (int i = 0; i < (userList.size()); i++) {
        if ((userList.get(i).getPIN()) == pin) {
            java.lang.System.out.println("Login successful!");
            user = userList.get(i);
            return user;
        }
    }
    return null;
}
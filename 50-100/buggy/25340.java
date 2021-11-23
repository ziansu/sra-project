public static java.util.List<io.github.tranngoclam.fastlist.model.User> copyAndSwapName(java.util.List<io.github.tranngoclam.fastlist.model.User> users) {
    java.util.List<io.github.tranngoclam.fastlist.model.User> newUsers = new java.util.ArrayList(users.size());
    for (io.github.tranngoclam.fastlist.model.User user : users) {
        io.github.tranngoclam.fastlist.model.User newUser = new io.github.tranngoclam.fastlist.model.User(user.age, user.gender, user.surname, user.password, user.phone, user.photo, user.name);
        newUsers.add(newUser);
    }
    java.util.Collections.shuffle(newUsers);
    return newUsers;
}
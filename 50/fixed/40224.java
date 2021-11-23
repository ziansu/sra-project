@org.junit.Test
public void findUserTest() {
    java.util.List<com.sohu.model.User> lists = UserService.findUser(15, 2);
    if (lists != null) {
        for (com.sohu.model.User user : lists) {
            logger.info(user.toString());
        }
    }
}
@cucumber.api.java.en.Given(value = "^\"(.*?)\" user with categories: (.+)$")
public void createUserWithCategories(java.lang.String username, java.util.List<java.lang.String> categories) {
    java.lang.Long userId = simpleDao.createUser(username, username);
    categories.stream().forEach(( categoryName) -> simpleDao.createCategory(userId, categoryName));
}
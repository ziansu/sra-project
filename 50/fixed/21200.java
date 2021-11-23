@cucumber.api.java.en.Given(value = "^\"(.*?)\" category$")
public void createCategory(java.lang.String categoryName) {
    simpleDao.createCategory(userId, categoryName);
}
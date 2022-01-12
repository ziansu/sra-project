@ru.yandex.qatools.allure.annotations.Step(value = "Search query: [{0}], for category: [{1}]")
private void searchByCategory(java.lang.String searchQuery, com.codeborne.selenide.SelenideElement element) {
    this.fieldSearch.clear();
    this.dropDownCategories.$("#search_facet_selector").click();
    element.click();
    element.shouldBe(Condition.visible);
    this.searchFor(searchQuery);
    if (searchQuery.equalsIgnoreCase("led lamp")) {
        searchQuery = searchQuery + "olo";
    }
    com.codeborne.selenide.Selenide.$("span.search-title-highlight").shouldHave(com.codeborne.selenide.Condition.text(searchQuery));
    com.codeborne.selenide.Selenide.$("span[style='background-color: #ffee33']").shouldBe(Condition.visible);
}
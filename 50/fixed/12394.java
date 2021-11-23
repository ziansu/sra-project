@ru.yandex.qatools.allure.annotations.Step
public gsmserver.Components.ProductList searchResultShouldHasSearchedPhrase(java.lang.String searchedPhrase) {
    searchTitle.shouldHave(com.codeborne.selenide.Condition.text(searchedPhrase));
    return this;
}
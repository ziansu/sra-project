protected org.nuxeo.functionaltests.contentView.ContentViewElement reload() {
    return getWebFragment(org.openqa.selenium.By.id(getId()), org.nuxeo.functionaltests.contentView.ContentViewElement.class);
}
@java.lang.Override
protected org.openqa.selenium.support.ui.Select safeGetSelect() {
    if ((this.select) == null) {
        this.select = new com.olenick.avatar.web.elements.AvatarMultiselectWebElement.AvatarSelect(this.safeGetUnderlyingWebElement(), this);
    }
    return this.select;
}
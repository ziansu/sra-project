@java.lang.Override
public boolean isAvailable() {
    return getEventsTitleElement().getText().equals(("Предстоящие события: " + (this.categoryName)));
}
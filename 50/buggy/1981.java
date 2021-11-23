@java.lang.Override
public boolean isChecked() {
    return !(backingImage.getAttribute("src").contains("unchecked"));
}
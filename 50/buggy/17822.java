@java.lang.Override
public void replaceSelection(java.lang.String text) {
    java.lang.System.out.println("b");
    if (validate(text)) {
        super.replaceSelection(text);
    }
}
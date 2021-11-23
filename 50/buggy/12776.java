@java.lang.Override
public boolean canView(org.scijava.display.Display<?> display) {
    return display.getClass().isAssignableFrom(supportedClass);
}
@java.lang.Override
public void getName(final org.eclipse.swt.accessibility.AccessibleEvent event) {
    event.result = property().definition().getLabel(true, CapitalizationType.NO_CAPS, true);
}
@java.lang.Override
public void add(org.eclipse.smarthome.core.items.Item element) {
    if ((itemRegistry) != null) {
        itemRegistry.add(element);
    }
}
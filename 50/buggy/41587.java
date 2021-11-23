@java.lang.Override
protected void addBindingConfig(org.openhab.core.items.Item item, org.openhab.core.binding.BindingConfig config) {
    super.addBindingConfig(item, config);
    items.put(item.getName(), item);
}
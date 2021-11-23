public static com.eucalyptus.binding.Binding getDefaultBinding() {
    if ((com.eucalyptus.binding.BindingManager.DEFAULT) != null) {
        return com.eucalyptus.binding.BindingManager.DEFAULT;
    }else {
        synchronized(com.eucalyptus.binding.BindingManager.class) {
            if ((com.eucalyptus.binding.BindingManager.DEFAULT) != null) {
                return com.eucalyptus.binding.BindingManager.DEFAULT;
            }else {
                return com.eucalyptus.binding.BindingManager.DEFAULT = com.eucalyptus.binding.BindingManager.getBinding(com.eucalyptus.binding.BindingManager.sanitizeNamespace(com.eucalyptus.binding.BindingManager.defaultBindingName()));
            }
        }
    }
}
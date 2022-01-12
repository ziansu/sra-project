private static void alterDelegate(java.lang.Object obj, java.lang.Object repl) {
    if (obj instanceof net.minecraft.item.Item) {
        cpw.mods.fml.common.registry.RegistryDelegate<net.minecraft.item.Item> delegate = ((net.minecraft.item.Item) (obj)).delegate;
        cpw.mods.fml.relauncher.ReflectionHelper.setPrivateValue(cofh.lib.util.RegistryUtils.Repl.DelegateClass, delegate, repl, "referant");
        cpw.mods.fml.relauncher.ReflectionHelper.setPrivateValue(cofh.lib.util.RegistryUtils.Repl.DelegateClass, ((net.minecraft.item.Item) (repl)).delegate, delegate.name(), "name");
    }
}
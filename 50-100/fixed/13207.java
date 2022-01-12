@java.lang.SuppressWarnings(value = "unchecked")
public static <C extends org.spongepowered.api.CatalogType> com.almuradev.almura.content.loader.CatalogDelegate<C> of(final C catalog) {
    final com.almuradev.almura.content.loader.CatalogDelegate<C> delegate = new com.almuradev.almura.content.loader.CatalogDelegate(catalog.getClass(), catalog.getId());
    delegate.set(catalog);
    return delegate;
}
public static <C extends org.spongepowered.api.CatalogType> com.almuradev.almura.content.loader.CatalogDelegate<C> of(final C catalog) {
    final com.almuradev.almura.content.loader.CatalogDelegate<C> delegate = new com.almuradev.almura.content.loader.CatalogDelegate(catalog.getClass().asSubclass(org.spongepowered.api.CatalogType.class), catalog.getId());
    delegate.set(catalog);
    return delegate;
}
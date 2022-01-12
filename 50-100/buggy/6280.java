@java.lang.Override
public <T, C extends java.util.Collection<T>> fr.openwide.core.wicket.more.bindable.model.IBindableCollectionModel<T, C> bindCollectionWithCache(org.bindgen.BindingRoot<? super E, C> binding, com.google.common.base.Supplier<? extends C> newCollectionSupplier, com.google.common.base.Function<? super T, ? extends org.apache.wicket.model.IModel<T>> itemModelFunction) {
    fr.openwide.core.commons.util.fieldpath.FieldPath path = fr.openwide.core.commons.util.fieldpath.FieldPath.fromBinding(binding);
    return bindCollectionWithCache(path, newCollectionSupplier, itemModelFunction);
}
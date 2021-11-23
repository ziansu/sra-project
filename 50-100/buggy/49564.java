public java.util.Optional<sirius.biz.storage.vfs.VirtualFile> findChild(java.lang.String name) {
    sirius.kernel.commons.ValueHolder<sirius.biz.storage.vfs.VirtualFile> childHolder = new sirius.kernel.commons.ValueHolder(null);
    childProvider.accept(this, ( c) -> {
        if (sirius.kernel.commons.Strings.areEqual(name, c.getName())) {
            childHolder.set(c);
        }
    });
    return java.util.Optional.ofNullable(childHolder.get());
}
public void enumerateChildren(java.util.function.Consumer<sirius.biz.storage.vfs.VirtualFile> consumer) {
    childProvider.accept(this, consumer);
}
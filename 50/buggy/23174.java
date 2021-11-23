protected void testStructureView(final java.lang.String model, final com.intellij.util.Consumer<com.intellij.ide.structureView.newStructureView.StructureViewComponent> consumer) {
    this.myFixture.configureByText(this.fileType, model);
    this.testStructureView(consumer);
}
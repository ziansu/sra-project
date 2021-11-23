@java.lang.Override
protected void edit() {
    java.lang.String value = ((java.lang.String) (list.getSelectedValue())).replaceAll(" ", "_");
    editor.open(value, twintro.minecraft.modbuilder.editor.generator.ResourcePackIO.toBufferedImage(twintro.minecraft.modbuilder.editor.generator.ResourcePackIO.resizeImage(elements.get(value), 16, 16).getImage()));
}
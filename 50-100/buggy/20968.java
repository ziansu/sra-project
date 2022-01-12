@org.beanfabrics.support.Operation
public void compileCommand() {
    de.adrodoc55.minecraft.mpl.compilation.MplCompilationResult result = compile();
    java.lang.String oneCommand = de.adrodoc55.minecraft.mpl.conversion.OneCommandConverter.convert(result);
    java.awt.Window activeWindow = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow();
    de.adrodoc55.minecraft.mpl.gui.dialog.OneCommandDialog dialog = new de.adrodoc55.minecraft.mpl.gui.dialog.OneCommandDialog(activeWindow);
    de.adrodoc55.minecraft.mpl.gui.dialog.OneCommandDialogPM dialogPm = new de.adrodoc55.minecraft.mpl.gui.dialog.OneCommandDialogPM();
    dialogPm.setText(oneCommand);
    dialog.setPresentationModel(dialogPm);
    dialog.setVisible(true);
}
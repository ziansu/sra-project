@java.lang.Override
public final void actionPerformed(final java.awt.event.ActionEvent event) {
    final MyCalculator.Model model = this.controller.getModel();
    final java.lang.String input = event.getActionCommand();
    if (model.isStart()) {
        model.setDisplayText("");
        model.setStart(false);
    }
    model.setDisplayText(((model.getDisplayText()) + input));
}
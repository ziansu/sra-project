public void log(java.lang.String message) {
    ui.TabDisplay.log.append((message + "\n"));
    if ((ui.TabDisplay.log.length()) > (maxCharacter)) {
        ui.TabDisplay.log = ui.TabDisplay.log.delete(0, ((ui.TabDisplay.log.length()) - (maxCharacter)));
    }
    prompt.setText(ui.TabDisplay.log.toString());
    scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getMaximum());
    this.revalidate();
}
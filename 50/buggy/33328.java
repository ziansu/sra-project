public void showExportMessage() {
    exportMessage = true;
    java.lang.System.out.println(("coucou - " + (exportMessage)));
    main.ChiptuneTracker.getInstance().getAsciiTerminal().repaint();
}
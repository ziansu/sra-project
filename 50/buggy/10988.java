public void install(glass.eclipse.theme.DockController controller, glass.eclipse.theme.DockTheme theme) {
    glass.eclipse.theme.DockTitleManager manager = controller.getDockTitleManager();
    manager.registerClient(FlapDockStation.BUTTON_TITLE_ID, CGlassDockTitleFactory.FACTORY);
}
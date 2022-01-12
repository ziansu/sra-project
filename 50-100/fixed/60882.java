public static void updateStyle(gui.lwjgl.style.StyleTemplate template) {
    gui.lwjgl.dialogs.DialogManager manager = gui.lwjgl.dialogs.DialogManager.getDefault();
    if ((manager.overlay) != null)
        manager.overlay.loadTemplate(template);
    
    for (int i = 0; i < (manager.activeDialogs.size()); i++) {
        manager.activeDialogs.get(i).loadTemplate(template);
    }
}
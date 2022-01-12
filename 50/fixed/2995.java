public static void hideAllMenuInstances() {
    for (org.vertexarmy.dsr.leveleditor.ui.menu.Menu menu : org.vertexarmy.dsr.leveleditor.ui.menu.Menu.INSTANCES) {
        menu.hide();
    }
}
public static void addAnotherWindowWithWindowMenu(jloda.gui.director.IDirector dir, javax.swing.JMenu menu) {
    if (((dir != null) && (!(dir.isInternalDocument()))) && (!(jloda.gui.director.ProjectManager.windowMenusUnderControl.contains(menu)))) {
        synchronized(jloda.gui.director.ProjectManager.projects) {
            jloda.gui.director.ProjectManager.dirAndWindowMenuPairs.add(new jloda.gui.director.Pair(dir, menu));
            jloda.gui.director.ProjectManager.menu2baseSize.put(menu, menu.getItemCount());
        }
        jloda.gui.director.ProjectManager.fireProjectsChanged();
    }
}
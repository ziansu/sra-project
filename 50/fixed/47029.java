public static void showQuery(de.szut.brennecke.SQLiteBrowser.GUI.GUI mainFrame, java.sql.ResultSet rs) {
    de.szut.brennecke.SQLiteBrowser.GUI.GUIGenerator.scrollPaneTable = new javax.swing.JScrollPane(de.szut.brennecke.SQLiteBrowser.GUI.GUIGenerator.generateJTable(rs, mainFrame));
    de.szut.brennecke.SQLiteBrowser.GUI.GUIGenerator.newQuerryReceived = true;
    de.szut.brennecke.SQLiteBrowser.GUI.GUIGenerator.updateMainFrame(mainFrame);
}
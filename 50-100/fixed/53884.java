public static void save(se.liu.ida.timha404.aleev379.tddd78.punchtower.gamestate.StateTower tower, java.lang.String filename) {
    se.liu.ida.timha404.aleev379.tddd78.punchtower.SaveFile save = new se.liu.ida.timha404.aleev379.tddd78.punchtower.SaveFile(filename);
    tower.saveToFile(save);
    try {
        save.saveToFile();
    } catch (se.liu.ida.timha404.aleev379.tddd78.punchtower.exceptions.SaveFailedException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(null, e.getStackTrace(), e.getMessage(), javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
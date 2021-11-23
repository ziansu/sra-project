public void mouseClicked(java.awt.event.MouseEvent arg0) {
    setpointClicked(arg0.getX(), arg0.getY());
    com.project.UI.checkClick(arg0.getX(), arg0.getY());
    java.lang.System.out.println((((java.lang.Integer.toString(arg0.getX())) + " ") + (java.lang.Integer.toString(arg0.getY()))));
    com.project.BattleUI.checkButtons(arg0.getX(), arg0.getY());
}
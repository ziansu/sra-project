public void setSheetPath(java.lang.String path) {
    java.lang.System.out.println(("setting in imgPanel: " + path));
    sheetData.reset();
    sheetData.setSheetPath(path, sheetButton);
    sheetButton.setIcon(new javax.swing.ImageIcon(panels.ImagePanel.getMaxScaledInstance(sheetData.getImage(), panels.ImagePanel.THUMB_WIDTH)));
    sheetButton.setText("View Canvas");
    canvas.refresh();
    sheetButton.revalidate();
    sheetButton.repaint();
}
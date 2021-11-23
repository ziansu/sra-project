public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if ((dt) != null) {
        currentPos = new int[(kb.getAttributeList().size()) - 1];
        for (int i = 0; i < (currentPos.length); i++)
            currentPos[i] = 0;
        
        drawTree(g, dt);
    }
}
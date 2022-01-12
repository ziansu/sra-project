private void drawMemory(java.awt.Graphics g, int from, int to) {
    g.setColor(java.awt.Color.GRAY);
    g.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, fontSize));
    final int[] memoryBlock = memory.getBlock(from, to);
    drawIndexedBlock(g, memoryBlock, 4);
}
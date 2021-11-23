private void drawMemory(java.awt.Graphics g, int from, int to) {
    g.setColor(java.awt.Color.GRAY);
    g.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, fontSize));
    final int[] memoryBlock = memory.getBlock(from, to);
    final int columns = 4;
    final int rowSize = 10;
    final int columnSize = 40;
    drawIndexedBlock(g, memoryBlock, columns, rowSize, columnSize);
}
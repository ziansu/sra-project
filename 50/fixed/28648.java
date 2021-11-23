public void renderScan() {
    int control = cpu.memory.readByte(GPU.LCD_CONTR_REG);
    if (cpu.bitTest(control, 0))
        renderTiles();
    
    if (cpu.bitTest(control, 1))
        renderSprites();
    
}
public void drawHighlights(java.awt.Color c1, java.awt.Color c2) {
    for (int i = 0; i < (this.description.size()); i++) {
        Instruction line = this.description.get(i);
        if (line.isHighlighted)
            this.drawLineHighlight(i, c1);
        
        if (line.isCycleHighlighted)
            this.drawLineHighlight(i, c2);
        
    }
}
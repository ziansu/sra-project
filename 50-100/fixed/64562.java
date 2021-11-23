private void color(int value) {
    if (value == 100) {
        color(java.awt.Color.GREEN);
    }else
        if (value >= 50) {
            color(java.awt.Color.ORANGE);
        }else
            if (value >= 0) {
                color(java.awt.Color.RED);
            }else {
                color(java.awt.Color.BLUE);
            }
        
    
    setOpaque(true);
    if (value > 70) {
        setForeground(java.awt.Color.WHITE);
    }else
        if (value > 0) {
            setForeground(java.awt.Color.BLACK);
        }else {
            setForeground(java.awt.Color.RED);
        }
    
}
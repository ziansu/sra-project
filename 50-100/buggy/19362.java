public void paint(java.awt.Graphics2D graphic2D) {
    java.lang.System.out.println(tick);
    if (((tick) < 10) && ((tick) < 20)) {
        graphic2D.setColor(java.awt.Color.RED);
        graphic2D.fillOval(12, 4, 50, 50);
        (tick)++;
    }else
        if (((tick) >= 10) && ((tick) < 20)) {
            (tick)++;
        }else
            if ((tick) >= 20)
                tick = 0;
            
        
    
}
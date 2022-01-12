void paint(java.awt.Graphics2D g) {
    for (soga2d.GraphicObject object : allItems()) {
        if (object != null)
            g.drawImage(object.getImage(), object.getX(), object.getY(), null);
        
    }
}
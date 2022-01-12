public void updateInhabitants() {
    this.removeAll();
    int x = 0;
    int y = 0;
    for (Agent a : inhabitants) {
        this.add(a);
        a.setLocation(x, y);
        if (x < (getWidth())) {
            x += 4;
        }else
            if (y > (getHeight())) {
                y += 4;
                x = 0;
            }
        
    }
}
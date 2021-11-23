public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((motorcycles_added) == false)
        addMotorcycles();
    
    motorcycles_added = true;
    velo = 100;
    score = 0;
    round = 100;
    y_frog = 510;
    x_frog = 380;
    points.setLabel(("Score: " + (score)));
}
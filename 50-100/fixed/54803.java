public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((motorcycles_added) == false)
        addMotorcycles();
    
    motorcycles_added = true;
    velo = 9;
    score = 0;
    round = 7;
    y_frog = 560;
    x_frog = 380;
    points.setLabel(("Score: " + (score)));
}
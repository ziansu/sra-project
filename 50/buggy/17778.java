public void keyReleased() {
    if ((key) == (ENTER))
        Visualizer.it_counter = (++(Visualizer.it_counter)) % (Visualizer.points_it.size());
    
}
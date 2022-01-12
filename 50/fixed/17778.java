public void keyReleased() {
    if (((key) == (ENTER)) && ((Visualizer.points_it.size()) != 0))
        Visualizer.it_counter = (++(Visualizer.it_counter)) % (Visualizer.points_it.size());
    
}
public void nextSlide() {
    (slide)++;
    if (((slide) % 4) == 1) {
        Objectives();
    }else
        if (((slide) % 4) == 2) {
            Turn();
        }else
            if (((slide) % 4) == 3) {
                unitTable();
            }else
                if (((slide) % 4) == 4) {
                    shortcuts();
                }
            
        
    
}
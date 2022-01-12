public void animate(int cs) {
    if (active) {
        if ((controlStateVisibility.contains(cs)) && ((activeUnit) != null)) {
            if ((opacity) != 1.0F)
                opacity += 0.25F;
            
            if ((opacity) > 1.0F)
                opacity = 1.0F;
            
        }else {
            if ((opacity) != 0.0F)
                opacity -= 0.5F;
            
            if ((opacity) < 0.0F)
                opacity = 0.0F;
            
        }
    }
}
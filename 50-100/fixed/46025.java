public void turnRight() {
    if (rover.getDirection().equals("N")) {
        rover.setDirection("E");
    }else
        if (rover.getDirection().equals("E")) {
            rover.setDirection("S");
        }else
            if (rover.getDirection().equals("S")) {
                rover.setDirection("W");
            }else
                if (rover.getDirection().equals("W")) {
                    rover.setDirection("N");
                }
            
        
    
}
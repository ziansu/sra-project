protected void setPositionAt(double coordinate, int index) throws java.lang.ArrayIndexOutOfBoundsException, java.lang.IllegalArgumentException {
    if (index == 1)
        this.Position = new jumpingalien.model.Position(coordinate, getPositionAt(2));
    else
        if (index == 2)
            this.Position = new jumpingalien.model.Position(getPositionAt(1), coordinate);
        
    
}
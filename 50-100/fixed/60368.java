public boolean isMap(model.MyVector xy) {
    if (((((xy.getX()) >= 800) || ((xy.getX()) < 0)) || ((xy.getY()) >= 600)) || ((xy.getY()) < 0))
        return false;
    else
        return model.Map.palya[xy.getX()][xy.getY()];
    
}
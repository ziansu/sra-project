public boolean getModelValue(int x, int y) {
    if ((y < (size)) && (x < (size)))
        return modelRep[yBathToModelRep(y)][xBathToModelRep(x)];
    else
        return false;
    
}
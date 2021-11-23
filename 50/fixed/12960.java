public boolean defrostScreen() {
    if (!(canDefrost()))
        return false;
    
    defrost();
    return true;
}
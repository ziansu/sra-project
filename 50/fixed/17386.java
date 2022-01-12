public boolean noRepeat() {
    for (int i = 0; i < (repeat.length); i++)
        if (repeat[i])
            return false;
        
    
    return true;
}
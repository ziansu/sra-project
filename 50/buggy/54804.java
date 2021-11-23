public float checkXPosition(float x) {
    if (x < 105)
        return 110;
    else
        if (x > 720)
            return 720;
        
    
    return x;
}
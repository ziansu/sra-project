public void shake(float level) {
    if ((shake) <= 0)
        oldPosition = position.cpy();
    
    shake += level;
}
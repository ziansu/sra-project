public void update() {
    (time)++;
    if (((time) % (rate)) == 0) {
        if ((frame) > (length))
            frame = 0;
        else
            (frame)++;
        
        sprite = sheet.getSprites()[frame];
    }
}
public void act() {
    if ((timer) > 0) {
        (timer)--;
        if ((timer) == 0) {
            ChangeMouseImage(cImage, x, y);
        }
    }else
        if (Greenfoot.mousePressed(getActor())) {
            java.lang.System.out.println(("Click Test: " + (Greenfoot.mouseClicked(getActor()))));
            play();
            timer = 2;
        }
    
}
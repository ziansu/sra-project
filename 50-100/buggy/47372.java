public void setPosition() {
    lastx = px;
    lasty = py;
    java.lang.System.out.println((((((direction) + ", ") + (px)) + ", ") + (py)));
    switch (direction) {
        case "u" :
            py -= speed;
        case "d" :
            py += speed;
        case "l" :
            px -= speed;
        case "r" :
            px += speed;
    }
    pacman.obj.Field.addObjectToRender(this);
}
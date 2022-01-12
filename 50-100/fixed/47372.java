public void setPosition() {
    lastx = px;
    lasty = py;
    switch (direction) {
        case "u" :
            py -= speed;
            break;
        case "d" :
            py += speed;
            break;
        case "l" :
            px -= speed;
            break;
        case "r" :
            px += speed;
            break;
    }
    pacman.obj.Field.addObjectToRender(this);
}
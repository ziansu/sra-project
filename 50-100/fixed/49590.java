public boolean collisionCircleItems(float x, float y, float radius) {
    for (com.awprog.roundsnakemulti.Item i : items)
        if ((((x - (i.x)) * (x - (i.x))) + ((y - (i.y)) * (y - (i.y)))) <= ((radius + (i.radius)) * (radius + (i.radius))))
            return true;
        
    
    return false;
}
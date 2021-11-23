public void update() {
    switch (type) {
        case Sliding :
            if ((position.x) < (-(width)))
                position.x += (width) / ((duration) * 60);
            
            break;
        case Rotating :
            if ((angle) < 0)
                angle += ((java.lang.Math.PI) / 2) / ((duration) * 60);
            
            break;
        case Ground :
            break;
    }
}
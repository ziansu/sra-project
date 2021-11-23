private float getDesiredZoomLevel(int level) {
    float zoom = 13.0F;
    switch (level) {
        case 1 :
            zoom = 13.0F;
            break;
        case 2 :
            zoom = 13.5F;
            break;
        case 3 :
            zoom = 14.0F;
            break;
        case 4 :
            zoom = 14.5F;
            break;
        case 5 :
            zoom = 15.0F;
            break;
    }
    return zoom;
}
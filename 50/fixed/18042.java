private java.lang.String selectTexture(int type) {
    java.lang.String textureString;
    switch (type) {
        case 1 :
            textureString = "Turtle_32x32_green_stand_L.png";
            break;
        case 2 :
            textureString = "Turtle_32x32_red_stand_L.png";
            break;
        default :
            throw new java.lang.IllegalArgumentException("No such texture");
    }
    return textureString;
}
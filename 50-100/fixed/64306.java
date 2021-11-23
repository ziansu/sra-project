public static org.ftcteam5206.utils.vectors.vector2d deadzone(org.ftcteam5206.utils.vectors.vector2d vector) {
    org.ftcteam5206.utils.vectors.vector2d output = new org.ftcteam5206.utils.vectors.vector2d();
    output.x = vector.x;
    output.y = vector.y;
    if ((java.lang.Math.abs(vector.x)) < 0.1)
        output.x = 0;
    
    if ((java.lang.Math.abs(vector.y)) < 0.1)
        output.y = 0;
    
    return output;
}
public void setRotation(int rot, boolean isDecoration) {
    while (rot < 0)
        rot += 360;
    
    if (isDecoration) {
        decorationRotation = rot;
    }else {
        rotation = rot;
        functionID = ((functionID) / 4) * 4;
        functionID += (rot / 90) % 4;
    }
}
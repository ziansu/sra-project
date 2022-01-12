private void checkTriangle() {
    if (((lineA) == (lineB)) && ((lineA) == (lineC))) {
        isEquilateral();
    }else
        if (((lineA) != (lineB)) && ((lineB) != (lineC))) {
            isScalene();
        }else {
            isIsosceles();
        }
    
}
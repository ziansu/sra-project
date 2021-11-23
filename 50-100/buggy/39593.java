private void checkTriangle() {
    if (((lineA) == (lineB)) && ((lineA) == (lineC))) {
        isEquilateral();
    }else
        if (((lineA) == (lineB)) && ((lineA) != (lineC))) {
            isIsosceles();
        }else {
            isScalene();
        }
    
}
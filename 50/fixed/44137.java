private static int getInContainerXorZ(int elementXorZ, int containerWidth) {
    if (elementXorZ < 0)
        return ((elementXorZ % containerWidth) + containerWidth) % containerWidth;
    
    return elementXorZ % containerWidth;
}
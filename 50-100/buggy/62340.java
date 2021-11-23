public static float calRotationDirection(float currentRotation, float desiredRotation) {
    currentRotation = com.inhavok.fallen.utility.GameMath.calEffectiveAngle(currentRotation);
    desiredRotation = com.inhavok.fallen.utility.GameMath.calEffectiveAngle(desiredRotation);
    int direction = 1;
    if (currentRotation >= 180) {
        currentRotation -= 180;
        direction *= -1;
    }
    if (desiredRotation >= 180) {
        desiredRotation -= 180;
        direction *= -1;
    }
    return direction * (com.inhavok.fallen.utility.GameMath.calDifferencePolarity(desiredRotation, currentRotation));
}
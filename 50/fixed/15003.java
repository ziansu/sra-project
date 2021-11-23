public static float getRealDistance(float prevDistance, float speed, long deltaTime) {
    return prevDistance + ((speed * deltaTime) / ((60 * 60) * 1000));
}
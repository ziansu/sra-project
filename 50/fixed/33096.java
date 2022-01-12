public static void move(com.bigcustard.blurp.core.common.Sprite sprite, double angle, double distance) {
    sprite.x += (BlurpStore.utils.cos(angle)) * distance;
    sprite.y -= (BlurpStore.utils.sin(angle)) * distance;
}
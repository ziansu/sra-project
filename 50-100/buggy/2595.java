private void setPosition(com.lost.blocks.Animator.BonePose key1, com.lost.blocks.Animator.BonePose key2, double interpolation) {
    position.x = interpolate(key1.position.x, key2.position.x, interpolation);
    position.y = interpolate(key1.position.y, key2.position.y, interpolation);
    position.z = interpolate(key1.position.z, key2.position.z, interpolation);
}
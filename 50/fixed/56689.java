@java.lang.Override
public void attached() {
    this.audioSource.setPosition(getTransform().getPosition());
    this.audioSource.setVelocity(Vector3f.ZERO);
}
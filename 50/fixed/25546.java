public void playAnimation(java.lang.String name, boolean looping) {
    anim = animations.get(name);
    animIndex = 0;
    animTime = anim.getLength(animIndex);
    texture = anim.getTexture(animIndex);
    this.looping = looping;
}
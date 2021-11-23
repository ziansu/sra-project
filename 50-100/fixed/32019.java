public void remove() {
    com.gmail.berndivader.mmArmorStandAnimator.ArmorStandAnimator.animators.remove(this);
    if (((this.aiMob) != null) && (!(this.aiMob.isDead()))) {
        this.aiMob.getEntity().remove();
    }
}
public void remove() {
    com.gmail.berndivader.mmArmorStandAnimator.ArmorStandAnimator.animators.remove(this);
    if (((this.aiMob) != null) && (!(this.aiMob.getEntity().isDead()))) {
        this.aiMob.getEntity().remove();
    }
}
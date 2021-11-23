@java.lang.Override
public void createCollision(com.kudodev.knimble.colliders.CapsuleCollider other, com.kudodev.knimble.contact.ContactCache contactCache) {
    other.createCollision(other, contactCache);
}
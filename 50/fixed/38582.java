public void healPlayer(int heal) {
    if ((heal + (health)) < (entities.EntityPlayer.baseHealth)) {
        health = (health) + heal;
    }
}
public void checkCollision(itcr.reciclemos.gameengine.Element element) {
    for (itcr.reciclemos.gameengine.ThrashCan thrashCan : this.thrashCans) {
        thrashCan.checkCollision(element);
    }
}
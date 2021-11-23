public boolean checkCollision(itcr.reciclemos.gameengine.Element element) {
    boolean result = false;
    for (itcr.reciclemos.gameengine.ThrashCan thrashCan : this.thrashCans) {
        if (thrashCan.checkCollision(element)) {
            result = true;
            break;
        }
    }
    return result;
}
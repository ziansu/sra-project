public main.Node findClosestPrecedingFinger(main.ID iden) {
    for (int i = (fingers.length) - 1; i >= 0; i++) {
        if (((this.fingers[i].identifier.compareTo(this.identifier)) > 0) && ((this.fingers[i].identifier.compareTo(iden)) < 0))
            return this.fingers[i];
        
    }
    return this;
}
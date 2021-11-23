public uml.sequencediagram.LifelinePoint addToMessage(uml.sequencediagram.Message message) {
    uml.sequencediagram.LifelinePoint p = null;
    if (message != null) {
        p = new uml.sequencediagram.LifelinePoint();
        p.setPosition(currentPosition);
        p.setMessage(message);
        message.setInPoint(p);
        addPoint(p);
        (currentPosition)++;
    }
    return p;
}
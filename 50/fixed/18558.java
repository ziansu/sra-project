public boolean use(io.muic.ooc.zork.Mortal target) {
    target.setHealth(((target.getHealth()) + (heal)));
    setNumberOfUse(((getNumberOfUse()) - 1));
    return true;
}
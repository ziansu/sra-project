@java.lang.Override
public void execute(personnages.Robot r) throws exceptions.NotDoableException {
    if (isDoable(r)) {
        throw new exceptions.NotDoableException("Imoossible de ramasser");
    }else {
        r.pickUp();
    }
}
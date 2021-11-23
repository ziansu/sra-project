@java.lang.Override
public void preSave() {
    if (isNew()) {
        setTransactionId(org.sola.services.common.LocalInfo.getTransactionId());
    }
    if ((isNew()) && ((getNr()) == null)) {
        setNr(generateRrrNumber());
        setCOfO(generateCofONumber());
    }
    super.preSave();
}
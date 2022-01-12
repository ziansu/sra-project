@java.lang.Override
public void preSave() {
    if (isNew()) {
        setTransactionId(org.sola.services.common.LocalInfo.getTransactionId());
        setNr(generateRrrNumber());
    }
    if ((getNr()) == null) {
        setTransactionId(org.sola.services.common.LocalInfo.getTransactionId());
        setCOfO(generateCofONumber());
    }
    super.preSave();
}
@java.lang.Override
public boolean deleteDebit(home.dm.service.dtos.DebitDto obj) {
    boolean result = true;
    java.lang.String requestId = java.util.UUID.randomUUID().toString();
    try {
        home.dm.dal.entities.Debit debit = App.MAPPER.map(obj, home.dm.dal.entities.Debit.class);
        _debitRepository.delete(debit);
        _debitRepository.commit();
    } catch (java.lang.Exception ex) {
        result = true;
        App.LOGGING.error(DmEventLog.HandledException, requestId, ex);
    }
    return result;
}
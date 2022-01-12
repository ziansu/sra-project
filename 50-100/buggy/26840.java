public synchronized void save(coursy.onlineTools.Uni entry) {
    if ((entry.getId()) == null) {
        entry.setId(((nextId)++));
    }
    try {
        entry = ((coursy.onlineTools.Uni) (org.apache.commons.beanutils.BeanUtils.cloneBean(entry)));
    } catch (java.lang.Exception ex) {
        throw new java.lang.RuntimeException(ex);
    }
    contacts.put(entry.getId(), entry);
}
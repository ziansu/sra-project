@java.lang.Override
@javax.transaction.Transactional
public java.lang.Long getNextId() {
    java.lang.Long lastID = 0L;
    for (com.tech.models.entities.Message vLookUp : repository.findAll()) {
        java.lang.System.out.println(lastID);
        if (((vLookUp.getId()) - lastID) == 1) {
            lastID = vLookUp.getId();
        }else {
            return lastID + 1;
        }
    }
    java.lang.System.out.println(("Finale : " + lastID));
    return lastID + 1L;
}
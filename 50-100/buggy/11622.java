@java.lang.Override
public com.tsystems.javaschool.db.entities.Contract addNew(com.tsystems.javaschool.db.entities.Contract contract, java.util.List<java.lang.Integer> optionsIds) {
    javax.persistence.EntityTransaction transaction = contractDao.getTransaction();
    com.tsystems.javaschool.business.services.interfaces.OptionService optionService = new com.tsystems.javaschool.business.services.implementations.OptionServiceImpl();
    boolean insideOtherTransaction = transaction.isActive();
    if (!insideOtherTransaction)
        transaction.begin();
    
    contract.setUsedOptions(optionService.loadOptionsByIds(optionsIds));
    contractDao.create(contract);
    if (!insideOtherTransaction)
        transaction.commit();
    
    return contract;
}
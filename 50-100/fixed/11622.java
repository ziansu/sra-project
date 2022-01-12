@java.lang.Override
public com.tsystems.javaschool.db.entities.Contract addNew(com.tsystems.javaschool.db.entities.Contract contract, java.util.List<java.lang.Integer> optionsIds) {
    javax.persistence.EntityTransaction transaction = contractDao.getTransaction();
    com.tsystems.javaschool.business.services.interfaces.OptionService optionService = new com.tsystems.javaschool.business.services.implementations.OptionServiceImpl();
    boolean insideOtherTransaction = transaction.isActive();
    contractDao.create(contract);
    return contract;
}
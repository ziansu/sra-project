@java.lang.Override
public com.tcts.datamodel.BankAdmin getBankAdminByBank(java.lang.String bankId) throws java.sql.SQLException {
    com.tcts.datamodel.BankAdmin result = null;
    java.util.List<com.tcts.datamodel.BankAdmin> bankAdmins = getBankAdmins();
    for (com.tcts.datamodel.BankAdmin bankAdmin : bankAdmins) {
        if (bankId.equals(bankAdmin.getBankId())) {
            result = bankAdmin;
            break;
        }
    }
    return result;
}
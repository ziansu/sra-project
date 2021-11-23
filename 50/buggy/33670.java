@java.lang.Override
public cheanxin.domain.Loan update(cheanxin.domain.User user, cheanxin.domain.Loan unsavedLoan, cheanxin.domain.Loan savedLoan) throws java.lang.IllegalAccessException {
    unsavedLoan.setVehiclePredictPrice(null);
    return super.updateLoan(user, unsavedLoan, savedLoan, false);
}
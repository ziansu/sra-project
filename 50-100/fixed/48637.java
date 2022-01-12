@java.lang.Override
public java.util.List<swqm.examples.payment.PaymentMethod> getAcceptedMethods(swqm.examples.payment.Address address, int amount, java.util.Currency currency) throws java.lang.IllegalArgumentException {
    int eurAmount = amount;
    if (!(currency.equals(swqm.examples.payment.fx.PaymentMethodServiceFxImpl.EUR))) {
        eurAmount = fxConverter.convertTo(currency, swqm.examples.payment.fx.PaymentMethodServiceFxImpl.EUR, amount);
    }
    java.util.List<swqm.examples.payment.PaymentMethod> result = super.getAcceptedMethods(address, eurAmount, swqm.examples.payment.fx.PaymentMethodServiceFxImpl.EUR);
    return result;
}
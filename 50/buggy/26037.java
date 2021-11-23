@java.lang.Override
public boolean isFreightOrPassenger() {
    if ((((this) instanceof train.common.api.Freight) || ((this) instanceof train.common.api.IPassenger)) || ((this) instanceof train.common.api.LiquidTank)) {
        return true;
    }
    return false;
}
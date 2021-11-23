@java.lang.Override
public boolean isFreightOrPassenger() {
    return (((this) instanceof train.common.api.Freight) || ((this) instanceof train.common.api.IPassenger)) || ((this) instanceof train.common.api.LiquidTank);
}
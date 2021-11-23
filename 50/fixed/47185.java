@java.lang.Override
public boolean isFreightCart() {
    return ((this) instanceof train.common.api.Freight) || ((this) instanceof train.common.api.LiquidTank);
}
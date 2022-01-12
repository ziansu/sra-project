@java.lang.Override
public void executeOnReply(pt.lsts.imc.ThermalCamControl sent, pt.lsts.imc.ThermalCamControl rec) {
    if ((rec.getFunction()) == (ThermalCamFunctionCodes.NO_OP.getFunctionCode())) {
        updateConnected(true);
    }else {
    }
}
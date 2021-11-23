@java.lang.Override
public void onHeatChange(nebula.common.util.Direction direction, long value) {
    this.helper.addInternalEnergy(value);
}
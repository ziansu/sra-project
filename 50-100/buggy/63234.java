@java.lang.Override
public li.klass.fhem.domain.core.FhemDevice apply(org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Integer> input) {
    li.klass.fhem.domain.FHEMWEBDevice device = new li.klass.fhem.domain.FHEMWEBDevice();
    device.setName(input.getLeft());
    device.setPort(java.lang.String.valueOf(input.getRight()));
    device.setGroup("someGroup");
    return device;
}
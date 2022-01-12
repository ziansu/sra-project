@java.lang.Override
public void addOutputSubstrates(java.util.List<edu.utexas.cs.nn.networks.hyperneat.Substrate> subs) {
    edu.utexas.cs.nn.networks.hyperneat.Substrate dpad = new edu.utexas.cs.nn.networks.hyperneat.Substrate(new edu.utexas.cs.nn.util.datastructures.Pair<java.lang.Integer, java.lang.Integer>(3, 2), edu.utexas.cs.nn.networks.hyperneat.Substrate.OUTPUT_SUBSTRATE, new edu.utexas.cs.nn.util.datastructures.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>(0, edu.utexas.cs.nn.networks.hyperneat.Substrate.OUTPUT_SUBSTRATE, 0), "D-Pad Outputs");
    dpad.addDeadNeuron(0, 0);
    dpad.addDeadNeuron(0, 2);
    dpad.addDeadNeuron(1, 1);
    subs.add(dpad);
}
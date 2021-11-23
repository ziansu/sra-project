@java.lang.Override
public global.FvLogic calculate() {
    return global.all_nets.get(output_wires[input_wires[0]]).assignment;
}
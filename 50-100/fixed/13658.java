@java.lang.Override
public void update() {
    super.update();
    int a = inputComonent.get(R.string.xorgate_a).getOutput(inputPort.get(R.string.xorgate_a));
    int b = inputComonent.get(R.string.xorgate_b).getOutput(inputPort.get(R.string.xorgate_b));
    output.put(R.string.xorgate_out, (a ^ b));
}
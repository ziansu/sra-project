@java.lang.Override
public void setup(edu.gsgp.experiment.data.Dataset dataset, edu.gsgp.nodes.Node tree) {
    super.setup(dataset, tree);
    double value;
    for (edu.gsgp.experiment.data.Instance instance : dataset) {
        value = tree.eval(instance.input);
        min = java.lang.Math.min(min, value);
        max = java.lang.Math.max(max, value);
    }
}
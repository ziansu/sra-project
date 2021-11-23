@java.lang.Override
public be.iminds.iot.dianne.api.nn.eval.Evaluation getResult() {
    be.iminds.iot.dianne.api.nn.eval.Evaluation eval = finish();
    eval.total = total;
    eval.error = (error) / (total);
    eval.outputs = outputs;
    eval.forwardTime = ((tForward) / 1000000.0F) / (total);
    eval.outputs = outputs;
    return eval;
}
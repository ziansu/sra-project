@java.lang.Override
protected void adaptSample(be.iminds.iot.dianne.api.dataset.Sample original, be.iminds.iot.dianne.api.dataset.Sample adapted) {
    adapted.input = original.input.copyInto(adapted.input);
    adapted.target = original.input.copyInto(adapted.target);
}
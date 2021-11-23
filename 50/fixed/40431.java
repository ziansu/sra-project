public model.data.describer.DataDescriber<model.data.value.NumberValue> resolve(model.data.DataModel model) {
    return new model.data.describer.OperationDescriber(resolveComputation(model));
}
model.data.process.DataProcess resolve(java.util.Map<language.Identifier, model.data.process.analysis.operations.Operation> macros) {
    switch (name.getName()) {
        case "from" :
            return new model.data.process.FromProcess(((language.Identifier) (parameters[0])));
        case "is" :
            return new model.data.process.IsProcess(((language.Identifier) (parameters[0])));
        case "constraint" :
            return new model.data.process.analysis.ConstraintAnalysis(((model.data.process.analysis.operations.constraints.Constraint) (macros.get(parameters[0]))));
    }
    throw new java.lang.UnsupportedOperationException("This code has not been implemented yet");
}
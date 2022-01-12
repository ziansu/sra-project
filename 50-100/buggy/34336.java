@com.google.common.annotations.VisibleForTesting
static io.crate.operation.udf.UserDefinedFunctionsMetaData putFunction(@org.elasticsearch.common.Nullable
io.crate.operation.udf.UserDefinedFunctionsMetaData functions, io.crate.operation.udf.UserDefinedFunctionMetaData function, boolean replaceExisting) {
    if (functions == null) {
        return io.crate.operation.udf.UserDefinedFunctionsMetaData.of(function);
    }else {
        if ((!replaceExisting) && (functions.contains(function))) {
            throw new io.crate.exceptions.UserDefinedFunctionAlreadyExistsException(function);
        }
        functions.put(function);
        return functions;
    }
}
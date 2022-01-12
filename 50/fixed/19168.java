public java.lang.Object either(gololang.FunctionReference mapping, gololang.FunctionReference recover) throws java.lang.Throwable {
    if (isError()) {
        return recover.invoke(error);
    }
    return mapping.invoke(value);
}
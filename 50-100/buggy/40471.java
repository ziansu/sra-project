public static com.jetbrains.ther.typing.TheRType getParamType(com.jetbrains.ther.typing.TheRParameter parameter, com.jetbrains.ther.typing.TheRFunctionType functionType) {
    com.jetbrains.ther.typing.TheRType type = functionType.getParameterType(parameter.getName());
    if (type != null) {
        return type;
    }
    type = com.jetbrains.ther.typing.TheRTypeProvider.guessTypeFromFunctionBody(parameter);
    if (type != null) {
        return type;
    }
    return TheRType.UNKNOWN;
}
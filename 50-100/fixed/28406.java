private void checkParamType(com.squareup.javapoet.TypeName param) {
    if ((((param.getClass()) == (com.squareup.javapoet.TypeName.class)) || (isRawType(param))) || (isParameterizedType(param))) {
        return ;
    }
    throw new com.baoyz.treasure.compiler.NotSupportTypeException(("Treasure not support type: " + (param.toString())));
}
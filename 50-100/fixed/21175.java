public void addFieldToIntent(com.squareup.javapoet.MethodSpec.Builder buildMethod, boolean initPrimitives) {
    if (!(isOptional())) {
        java.lang.Object primitiveDefaultValue = com.michaelflisar.bundlebuilder.Util.getPrimitiveTypeDefaultValue(mType);
        if (primitiveDefaultValue == null) {
            if (!(mNullable))
                com.michaelflisar.bundlebuilder.Util.addNullCheckWithException(buildMethod, this);
            
        }
    }
    buildMethod.addStatement("intent.putExtra($S, $N)", mParamName, mParamName);
}
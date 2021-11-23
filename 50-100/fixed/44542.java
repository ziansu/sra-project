@java.lang.Override
void generateArrayElementEquals(net.openhft.chronicle.values.ArrayFieldModel arrayFieldModel, net.openhft.chronicle.values.ValueBuilder valueBuilder, com.squareup.javapoet.MethodSpec.Builder methodBuilder) {
    methodBuilder.addCode(java.lang.String.format("if ($N(%s) != $N(other.$N(index))) return false;\n", wrap(valueBuilder, methodBuilder, "$N[index]")), toBits(), field, toBits(), arrayFieldModel.getOrGetVolatile().getName());
}
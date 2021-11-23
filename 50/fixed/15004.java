@java.lang.Override
public void setConstructor() {
    this.setBasicBlockConstructor(com.squareup.javapoet.MethodSpec.constructorBuilder().addModifiers(javax.lang.model.element.Modifier.PUBLIC).addCode(this.getConstructorSpec().build()).build());
}
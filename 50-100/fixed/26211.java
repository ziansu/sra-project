@java.lang.Override
public org.jetbrains.kotlin.cli.jvm.compiler.JetClassOrObject fun(org.jetbrains.kotlin.cli.jvm.compiler.JetClassOrObject classOrObject) {
    if (classOrObject instanceof org.jetbrains.kotlin.cli.jvm.compiler.JetClass) {
        org.jetbrains.kotlin.cli.jvm.compiler.JetClassObject classObject = ((org.jetbrains.kotlin.cli.jvm.compiler.JetClass) (classOrObject)).getClassObject();
        if (classObject != null) {
            return classObject.getObjectDeclaration();
        }
    }
    return null;
}
@org.jetbrains.annotations.NotNull
public org.jetbrains.kotlin.js.translate.context.JsName getNameForPackage(@org.jetbrains.annotations.NotNull
final org.jetbrains.kotlin.name.FqName packageFqName) {
    return com.intellij.util.containers.ContainerUtil.getOrCreate(packageNames, packageFqName, new com.intellij.openapi.util.Factory<org.jetbrains.kotlin.js.translate.context.JsName>() {
        @java.lang.Override
        public org.jetbrains.kotlin.js.translate.context.JsName create() {
            java.lang.String name = org.jetbrains.kotlin.js.translate.context.Namer.generatePackageName(packageFqName);
            return rootPackageScope.declareName(name);
        }
    });
}
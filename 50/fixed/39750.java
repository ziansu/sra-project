@org.jetbrains.annotations.NotNull
public static com.github.me10zyl.entity.ClassProperty newNullProp() {
    com.github.me10zyl.entity.ClassProperty classProp = new com.github.me10zyl.entity.ClassProperty("*");
    classProp.setPsiField(null);
    classProp.setPsiClass(null);
    classProp.setEnable(true);
    classProp.setPlaceHolder(true);
    return classProp;
}
private java.lang.String getAtCode() {
    org.spongepowered.asm.mixin.injection.InjectionPoint.AtCode code = this.getClass().<org.spongepowered.asm.mixin.injection.InjectionPoint.AtCode>getAnnotation(org.spongepowered.asm.mixin.injection.InjectionPoint.AtCode.class);
    return code == null ? this.getClass().getName() : code.value();
}
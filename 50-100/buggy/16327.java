@javax.inject.Inject
void injectorReady() {
    this.injectorReady = true;
    final java.util.function.Consumer<java.lang.reflect.Method> staticAction = this.schedulingService::scheduleStaticMethod;
    this.scheduleStatics.forEach(( type) -> {
        de.skuzzle.inject.async.util.MethodVisitor.forEachStaticMethod(type, staticAction);
    });
    this.scheduleStatics.clear();
    this.scheduleStatics = null;
}
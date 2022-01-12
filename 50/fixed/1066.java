public com.blade.Blade iocInit() {
    iocApplication.init(iocs(), bootstrap);
    return this;
}
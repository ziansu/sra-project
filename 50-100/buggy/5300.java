void initialise() {
    if (this.initialised) {
        return ;
    }
    this.initialised = true;
    this.initialiseMixins(this.mixinClasses, false);
    switch (org.spongepowered.asm.mixin.MixinEnvironment.getCurrentEnvironment().getSide()) {
        case CLIENT :
            this.initialiseMixins(this.mixinClassesClient, false);
            break;
        case SERVER :
            this.initialiseMixins(this.mixinClassesServer, false);
            break;
        case UNKNOWN :
            this.logger.warn("Mixin environment was unable to detect the current side, sided mixins will not be applied");
            break;
    }
}
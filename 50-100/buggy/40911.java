public java.util.Optional<org.spongepowered.api.resourcepack.ResourcePack> poll() {
    synchronized(this.queue) {
        final org.spongepowered.api.resourcepack.ResourcePack resourcePack = this.waitingForResponse;
        if (!(this.queue.isEmpty())) {
            this.send(this.queue.remove(0));
        }
        return java.util.Optional.ofNullable(resourcePack);
    }
}
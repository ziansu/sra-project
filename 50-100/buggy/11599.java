@java.lang.Override
public void setFakeHash() {
    if ((this.hash.length()) == 0) {
        this.hash = this.pack.getId();
        if ((this.hash.length()) == (org.spongepowered.common.resourcepack.SpongeResourcePack.HASH_SIZE)) {
            this.hash += " ";
        }
    }
}
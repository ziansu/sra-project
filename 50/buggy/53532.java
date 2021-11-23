public void tick() {
    java.lang.System.arraycopy(level, 0, bufferedLevel, 0, net.aegistudio.mcb.Facing.values().length);
    super.component.tick(this);
}
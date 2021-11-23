public void write(final io.github.alivety.ppl.Packet p) {
    try {
        Main.out.debug(((((this) + ".write(") + p) + ")"));
        this.write(io.github.alivety.conquerors.common.Main.encode(p));
    } catch (final java.io.IOException e) {
        io.github.alivety.conquerors.common.Main.handleError(e);
    }
}
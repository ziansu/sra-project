@java.lang.Override
public io.atomix.copycat.server.storage.snapshot.SnapshotReader read(io.atomix.catalyst.buffer.Buffer buffer) {
    this.buffer.read(buffer);
    return this;
}
public xyz.upperlevel.openverse.client.render.world.util.VertexBuffer getBufferOrNull() {
    xyz.upperlevel.openverse.client.render.world.util.VertexBuffer buf = buffers.poll();
    if (buf == null) {
        if (tryIncrementSize()) {
            return new xyz.upperlevel.openverse.client.render.world.util.VertexBuffer(this);
        }else {
            return null;
        }
    }else {
        return buf;
    }
}
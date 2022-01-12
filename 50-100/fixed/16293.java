public void update() {
    if (((changed) && (!(updating))) && (updated)) {
        updated = false;
        Game.chunks_workers_executor_service.add_worker(new me.geakstr.voxel.workers.ChunkWorker(this));
    }
    if ((updated) && (updating)) {
        updating = false;
        update_vbo();
    }
    changed = false;
}
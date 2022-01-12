@java.lang.Override
public void update() {
    super.update();
    this.x = (this.renderer.x()) + ((com.darkxell.client.resources.images.AbstractDungeonTileset.TILE_SIZE) / 2);
    this.y = (this.renderer.y()) + ((com.darkxell.client.resources.images.AbstractDungeonTileset.TILE_SIZE) / 2);
}
@java.lang.Override
public void draw(com.gildedgames.util.ui.graphics.Graphics2D graphics, com.gildedgames.util.ui.input.InputProvider input) {
    graphics.drawSprite(this.sprite, this.dim(), this.data);
    super.draw(graphics, input);
}
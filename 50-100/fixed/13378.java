public void reset() {
    de.looksgood.ani.Ani.to(this, ((float) (0.5)), "x", this.x_origin);
    de.looksgood.ani.Ani.to(this, ((float) (0.5)), "y", this.y_origin);
    this.x = this.x_origin;
    this.y = this.y_origin;
}
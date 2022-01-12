public boolean handleTap(float x, float y) {
    return (((x >= ((this.x) - (1.5F * (r)))) && (x <= ((this.x) + (1.5F * (r))))) && (y >= ((this.y) - (15.0F * (r))))) && (y <= ((this.y) + (1.5F * (r))));
}
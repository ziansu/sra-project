public void removefood(org.bukkit.Material _material) {
    if (this.isfoodfound(_material)) {
        this.food.remove(_material);
    }
}
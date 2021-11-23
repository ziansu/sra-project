public boolean display() {
    if (updateLifetime()) {
        model.render(vertices);
        return true;
    }else {
        model.destroy();
        game.removeProjectile(this);
        return false;
    }
}
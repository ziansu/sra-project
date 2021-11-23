private void checkTrap(com.jkjk.GameWorld.MMClient client) {
    bodyToRemove = trapToRemove.poll();
    if ((bodyToRemove) != null) {
        trapList.remove(bodyToRemove.getPosition());
        client.removeTrapLocation(bodyToRemove.getPosition().x, bodyToRemove.getPosition().y);
        bodyToRemove.setActive(false);
        bodyToRemove.setTransform(0, 0, 0);
    }
}
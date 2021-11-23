protected int translateX(int screenX) {
    return com.badlogic.gdx.math.MathUtils.clamp(((screenX - (offsetX)) / (cellWidth)), 0, ((gridWidth) - 1));
}
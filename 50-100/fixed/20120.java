java.awt.Color getColor() {
    switch (tile.getType()) {
        case Null :
            return java.awt.Color.gray;
        case Number :
            int num = tile.getNumber();
            return kiviuq.views.TileView.NUMBER_COLORS[num];
        case Relase :
            return java.awt.Color.PINK;
        default :
            return java.awt.Color.BLACK;
    }
}
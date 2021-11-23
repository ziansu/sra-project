private void sortSprites() {
    indices.sort(( i, j) -> (sprites.get(i).getTexture().getID()) < (sprites.get(j).getTexture().getID()) ? 1 : -1);
}
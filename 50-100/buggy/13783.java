private void initCAGrid() {
    int[][] pattern = new int[][]{ new int[]{ 0 , 1 , 0 } , new int[]{ 1 , 0 , 1 } , new int[]{ 0 , 1 , 0 } };
    addComponent(new com.emergentorganization.cellrpg.components.entity.GridSeedComponent(pattern, 1, new com.badlogic.gdx.math.Vector2(0, 0), com.emergentorganization.cellrpg.scenes.CALayer.VYROIDS));
}
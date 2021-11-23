public int getActualY() {
    return (y) - (((int) ((GlobalData.client.worldEntity.getTime()) - (spawnTime))) / 20);
}
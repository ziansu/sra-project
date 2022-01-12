private static java.lang.String computeString(fr.utbm.info.vi51.worldswar.perception.PerceptionCell cell) {
    if ((cell.getAntHill()) != null) {
        final int availableFood = cell.getAntHill().getAvailableFood();
        return java.lang.String.format("f:%d", availableFood);
    }
    if ((cell.getAnt()) != null) {
        final int foodCarried = cell.getAnt().getFoodCarried();
        return java.lang.String.format("f:%d", foodCarried);
    }
    return null;
}
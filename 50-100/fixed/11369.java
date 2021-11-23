public java.util.List<com.github.bwsoft.iris.sample.FuelFigures.FuelFigure> getFuelFigures(com.github.bwsoft.iris.message.GroupObject msgObj) {
    figures.clear();
    com.github.bwsoft.iris.message.GroupObjectArray fuelFiguresGroup = msgObj.getGroupArray(fuelFigures);
    for (int i = 0; i < (fuelFiguresGroup.getNumOfGroups()); i++) {
        com.github.bwsoft.iris.message.GroupObject aFigureObj = fuelFiguresGroup.getGroupObject(i);
        com.github.bwsoft.iris.sample.FuelFigures.FuelFigure aFigure = new com.github.bwsoft.iris.sample.FuelFigures.FuelFigure();
        aFigure.speed = aFigureObj.getFloat(speed);
        aFigure.mpg = aFigureObj.getFloat(mpg);
        figures.add(aFigure);
    }
    return figures;
}
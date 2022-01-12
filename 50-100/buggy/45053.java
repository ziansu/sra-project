private void doGeneration() {
    net.shadowmage.ancientwarfare.structure.town.TownGeneratorBorders.generateBorders(world, area);
    net.shadowmage.ancientwarfare.structure.town.TownGeneratorBorders.levelTownArea(world, area);
    net.shadowmage.ancientwarfare.structure.town.TownGeneratorWalls.generateWalls(world, area, template, rng);
    this.generateGrid();
    this.generateRoads(world);
    net.shadowmage.ancientwarfare.structure.template.StructureTemplate townHall = null;
    if ((template.getTownHallEntry()) != null) {
        townHall = net.shadowmage.ancientwarfare.structure.template.StructureTemplateManager.instance().getTemplate(template.getTownHallEntry().templateName);
    }
    this.generateStructures(world, townHall, templatesToGenerate);
}
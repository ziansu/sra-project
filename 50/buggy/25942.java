public void show() {
    com.coffee.entity.EntityFactory.setEngine(ENGINE);
    APP.getInputMultiplexer().addProcessor(Mapper.INPUT.get(PLAYER).PROCESSOR);
    APP.getInputMultiplexer().addProcessor(DEBUG);
}
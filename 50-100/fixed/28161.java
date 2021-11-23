private void loadEnvironment() {
    java.lang.System.out.println("loadEnvironment");
    sceneAttributes = new com.badlogic.gdx.graphics.g3d.Attributes();
    sun = com.jankuester.ggj.twentyseventeen.models.factories.ModelFactory.createSun(0, 5, 0, Color.GREEN, 50);
    environment = new com.badlogic.gdx.graphics.g3d.Environment();
    java.lang.System.out.println("loadEnvironment done");
    sceneAttributes.set(com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute.createDiffuse(Color.GREEN), com.jankuester.ggj.twentyseventeen.models.factories.AttributeFactory.getPointLightAttribute(sun.getLight()));
}
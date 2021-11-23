@java.lang.Override
public com.badlogic.ashley.core.Component duplicate(com.badlogic.ashley.core.Engine engine) {
    net.mgsx.game.plugins.spline.components.PathComponent clone = engine.createComponent(net.mgsx.game.plugins.spline.components.PathComponent.class);
    clone.path = path;
    return clone;
}
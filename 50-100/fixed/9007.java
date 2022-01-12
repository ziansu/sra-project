@java.lang.Override
public void handleInput(nl.weeaboo.vn.math.Matrix parentTransform, nl.weeaboo.vn.input.IInput input) {
    nl.weeaboo.vn.math.Matrix inputTransform = parentTransform.translatedCopy((-(getX())), (-(getY())));
    for (nl.weeaboo.vn.scene.IVisualElement elem : nl.weeaboo.vn.scene.impl.SceneUtil.getChildren(this, VisualOrdering.FRONT_TO_BACK)) {
        elem.handleInput(inputTransform, input);
    }
}
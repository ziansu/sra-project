@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if ((rendererTransition.currentValue) == (rendererTransition.defaultTargetValueIn)) {
        rendererStates.put(rendererTransition.rendererKey, com.joe.holi.view.renderers.scene.helper.SceneConceptRenderersHelper.RENDERER_STATE_IN);
    }else
        if ((rendererTransition.currentValue) == (rendererTransition.defaultTargetValueOut)) {
            rendererStates.put(rendererTransition.rendererKey, com.joe.holi.view.renderers.scene.helper.SceneConceptRenderersHelper.RENDERER_STATE_OUT);
            renderers.get(rendererTransition.rendererKey).stopDraw();
        }
    
}
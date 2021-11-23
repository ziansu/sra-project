@javax.inject.Inject
@org.eclipse.e4.core.di.annotations.Optional
private void pursueNorm(@org.eclipse.e4.ui.di.UIEventTopic(value = org.normlogic.navigator.core.Event.PURSUE_NORM)
org.normlogic.navigator.core.IPursuedConclusion norms) {
    pursuedNorms = norms;
    setText(norm);
}
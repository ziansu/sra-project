@java.lang.Override
public void partHandle(fr.inria.soctrace.framesoc.core.bus.FramesocBusTopic topic, java.lang.Object data) {
    if (topic.equals(FramesocBusTopic.TOPIC_UI_COLORS_CHANGED)) {
        if ((currentShownTrace) == null)
            return ;
        
        fr.inria.soctrace.framesoc.ui.model.ColorsChangeDescriptor des = ((fr.inria.soctrace.framesoc.ui.model.ColorsChangeDescriptor) (data));
        fr.inria.soctrace.framesoc.ui.histogram.view.HistogramView.logger.debug("Colors changed: {}", des);
        for (fr.inria.soctrace.framesoc.ui.providers.SquareIconLabelProvider p : labelProviders) {
            p.disposeImages();
        }
        refresh(false, false);
    }
}
@java.lang.Override
public void handle(fr.inria.soctrace.framesoc.core.bus.FramesocBusTopic topic, java.lang.Object data) {
    if (topic.equals(FramesocBusTopic.TOPIC_UI_COLORS_CHANGED)) {
        if ((((statProvider) != null) && ((statProvider.getTableData()) != null)) && ((tableViewer) != null)) {
            statProvider.updateColor();
            updateTableData();
        }
    }
}
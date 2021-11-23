@java.lang.Override
public void process(cfa.vo.iris.sed.ExtSed source, cfa.vo.iris.events.SedCommand payload) {
    if ((payload.equals(SedCommand.ADDED)) || (payload.equals(SedCommand.CHANGED))) {
        update(source);
    }else
        if (payload.equals(SedCommand.REMOVED)) {
            sedPreferences.remove(source);
            sedPreferences.get(source).removeAll();
        }
    
    cfa.vo.iris.visualizer.preferences.VisualizerChangeEvent.getInstance().fire(source, VisualizerCommand.RESET);
}
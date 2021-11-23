@java.lang.Override
public void process(cfa.vo.iris.sed.ExtSed source, cfa.vo.iris.events.SedCommand payload) {
    if ((payload.equals(SedCommand.ADDED)) || (payload.equals(SedCommand.CHANGED))) {
        update(source);
    }else
        if (payload.equals(SedCommand.REMOVED)) {
            remove(source);
        }else {
            fire(source, VisualizerCommand.RESET);
        }
    
}
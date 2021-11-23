public void process(final cfa.vo.iris.sed.ExtSed source, cfa.vo.iris.events.SedCommand payload) {
    if ((payload == (cfa.vo.iris.events.SedCommand.SELECTED)) || (payload == (cfa.vo.iris.events.SedCommand.CHANGED))) {
        if ((source.getNumberOfSegments()) > 0) {
            display(source);
        }
    }else
        if (payload == (cfa.vo.iris.events.SedCommand.REMOVED)) {
            remove(source);
        }
    
}
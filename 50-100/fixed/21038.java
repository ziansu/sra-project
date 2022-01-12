@java.lang.Override
public OutputStream.OutputEventType visitOutput_event_type(@org.antlr.v4.runtime.misc.NotNull
org.wso2.siddhi.query.compiler.SiddhiQLParser.Output_event_typeContext ctx) {
    if ((ctx.ALL()) != null) {
        if ((ctx.RAW()) != null) {
            return OutputStream.OutputEventType.ALL_RAW_EVENTS;
        }else {
            return OutputStream.OutputEventType.ALL_EVENTS;
        }
    }else
        if ((ctx.EXPIRED()) != null) {
            if ((ctx.RAW()) != null) {
                return OutputStream.OutputEventType.EXPIRED_RAW_EVENTS;
            }else {
                return OutputStream.OutputEventType.EXPIRED_EVENTS;
            }
        }else {
            return OutputStream.OutputEventType.CURRENT_EVENTS;
        }
    
}
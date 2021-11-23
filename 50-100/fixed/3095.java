@java.lang.Override
public void evaluate(jw.jzbot.fact.Sink sink, jw.jzbot.fact.ArgumentList arguments, jw.jzbot.fact.FactContext context) {
    java.lang.Boolean result = jw.jzbot.fact.functions.conditional.IfFunction.findValueOrNull(arguments.resolveString(0));
    if (result != null) {
        if (result.equals(java.lang.Boolean.TRUE))
            sink.write("true");
        else
            if (result.equals(java.lang.Boolean.FALSE))
                sink.write("false");
            
        
    }
}
@java.lang.Override
public java.lang.Object invokeMethod(java.lang.String name, java.lang.Object args) {
    if (name.equals(desc.getFunctionName())) {
        try {
            return desc.newInstance(org.jenkinsci.plugins.workflow.cps.DSL.parseArgs(args, desc).namedArgs);
        } catch (java.lang.RuntimeException x) {
            throw x;
        } catch (java.lang.Exception x) {
            throw new java.lang.RuntimeException(x);
        }
    }else {
        return super.invokeMethod(name, args);
    }
}
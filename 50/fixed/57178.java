@java.lang.Deprecated
public static org.kframework.backend.java.kil.TermContext of(org.kframework.backend.java.kil.GlobalContext global) {
    return new org.kframework.backend.java.kil.TermContext(global, new org.kframework.backend.java.kil.TermContext.FreshCounter(0));
}
@java.lang.Override
public boolean check(com.github.dakusui.jcunit.core.tuples.Tuple tuple) throws com.github.dakusui.jcunit.exceptions.UndefinedSymbol {
    if (tuple.containsKey("another")) {
        return (tuple.get("another")) != null;
    }else {
        throw new com.github.dakusui.jcunit.exceptions.UndefinedSymbol("another");
    }
}
@com.oracle.truffle.api.dsl.Specialization
public final som.vmobjects.SObject.SImmutableObject createPromisePair(final java.lang.Object nil, @com.oracle.truffle.api.dsl.Cached(value = "create()")
final com.oracle.truffle.api.nodes.DirectCallNode factory) {
    som.interpreter.actors.SPromise promise = som.interpreter.actors.SPromise.createPromise(som.interpreter.actors.EventualMessage.getActorCurrentMessageIsExecutionOn());
    som.interpreter.actors.SPromise.SResolver resolver = som.interpreter.actors.SPromise.createResolver(promise);
    return ((som.vmobjects.SObject.SImmutableObject) (factory.call(new java.lang.Object[]{ som.interpreter.actors.SPromise.pairClass , promise , resolver })));
}
@com.oracle.truffle.api.dsl.Specialization(guards = { "isResultUsed()" , "isPromiseRcvr(args)" })
public final som.interpreter.actors.SPromise toPromiseWithResultPromise(final java.lang.Object[] args, @com.oracle.truffle.api.dsl.Cached(value = "createRegisterNode()")
final som.interpreter.actors.RegisterOnPromiseNode.RegisterWhenResolved registerNode) {
    som.interpreter.actors.SPromise rcvr = ((som.interpreter.actors.SPromise) (args[0]));
    som.interpreter.actors.SPromise promise = som.interpreter.actors.SPromise.createPromise(som.interpreter.actors.EventualMessage.getActorCurrentMessageIsExecutionOn());
    som.interpreter.actors.SPromise.SResolver resolver = som.interpreter.actors.SPromise.createResolver(promise, "eventualSendToPromise:", selector);
    sendPromiseMessage(args, rcvr, resolver, registerNode);
    return promise;
}
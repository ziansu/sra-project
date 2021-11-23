@com.oracle.truffle.api.dsl.Specialization(guards = { "isResultUsed()" , "!isFarRefRcvr(args)" , "!isPromiseRcvr(args)" })
public final som.interpreter.actors.SPromise toNearRefWithResultPromise(final java.lang.Object[] args) {
    som.interpreter.actors.Actor current = som.interpreter.actors.EventualMessage.getActorCurrentMessageIsExecutionOn();
    som.interpreter.actors.SPromise result = som.interpreter.actors.SPromise.createPromise(current);
    som.interpreter.actors.SPromise.SResolver resolver = som.interpreter.actors.SPromise.createResolver(result);
    som.interpreter.actors.EventualMessage.DirectMessage msg = new som.interpreter.actors.EventualMessage.DirectMessage(som.interpreter.actors.EventualMessage.getCurrentExecutingMessageId(), current, selector, args, current, resolver, onReceive, messageReceiverBreakpoint.executeCheckIsSetAndEnabled(), promiseResolverBreakpoint.executeCheckIsSetAndEnabled(), promiseResolutionBreakpoint.executeCheckIsSetAndEnabled());
    current.send(msg);
    return result;
}
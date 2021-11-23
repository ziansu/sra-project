@com.oracle.truffle.api.dsl.Specialization(guards = { "isResultUsed()" , "isFarRefRcvr(args)" })
public final som.interpreter.actors.SPromise toFarRefWithResultPromise(final java.lang.Object[] args) {
    som.interpreter.actors.Actor owner = som.interpreter.actors.EventualMessage.getActorCurrentMessageIsExecutionOn();
    som.interpreter.actors.SPromise result = som.interpreter.actors.SPromise.createPromise(owner);
    som.interpreter.actors.SPromise.SResolver resolver = som.interpreter.actors.SPromise.createResolver(result, "eventualSend:", selector);
    sendDirectMessage(args, owner, resolver);
    return result;
}
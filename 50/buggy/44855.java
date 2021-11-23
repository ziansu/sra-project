@java.lang.Override
public void error(java.lang.Throwable e) {
    error = reactor.core.publisher.Operators.onOperatorError(java.util.Objects.requireNonNull(e, "error"));
    done = true;
}
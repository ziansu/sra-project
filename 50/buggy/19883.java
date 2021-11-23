@java.lang.Override
public <T> T until(java.util.function.Function<? super org.fluentlenium.core.FluentControl, T> function) {
    updateWaitWithDefaultExceptions();
    return wait.until(function::apply);
}
@java.lang.Override
public void apply(final delight.async.callbacks.ValueCallback<delight.functional.Success> callback) {
    this.map.start(delight.async.AsyncCommon.<delight.functional.Success>asSimpleCallback(callback));
}
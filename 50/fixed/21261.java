@java.lang.Override
public void deliverResult(TModel result) {
    this.result = result;
    if (this.isStarted()) {
        super.deliverResult(result);
    }
}
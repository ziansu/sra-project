@java.lang.Override
public void onComplete(com.goolla.http.callback.objects.ResultObject value) {
    isComplete[0] = true;
    latch.countDown();
}
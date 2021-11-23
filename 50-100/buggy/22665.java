@java.lang.Override
public void onResume() {
    super.onResume();
    consumerThread = new ru.yandex.yamblz.concurrency.PostConsumer(this::postFinish, ru.yandex.yamblz.ui.fragments.ContentFragment.PRODUCERS_COUNT, this);
    threads.add(consumerThread);
    consumerThread.start();
    for (int i = 0; i < (ru.yandex.yamblz.ui.fragments.ContentFragment.PRODUCERS_COUNT); i++) {
        ru.yandex.yamblz.concurrency.LoadProducer loadProducer = new ru.yandex.yamblz.concurrency.LoadProducer(dataResults, this::postResult, consumerThread.getCyclicBarrier(), this);
        threads.add(loadProducer);
        loadProducer.start();
    }
}
@java.lang.Override
public void onResume() {
    super.onResume();
    new ru.yandex.yamblz.concurrency.PostConsumer(this::postFinish).start();
    for (int i = 0; i < (ru.yandex.yamblz.ui.fragments.ContentFragment.PRODUCERS_COUNT); i++) {
        new ru.yandex.yamblz.concurrency.LoadProducer(dataResults, this::postResult).start();
    }
}
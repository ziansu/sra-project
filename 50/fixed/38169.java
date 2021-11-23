@java.lang.Override
public void onNext(T t) {
    if (!(isSelected())) {
        return ;
    }
    subscriber.onNext(t);
}
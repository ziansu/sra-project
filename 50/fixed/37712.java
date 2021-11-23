@java.lang.Override
public void onClick(android.view.View v) {
    v.setTag(info);
    onClickSubject.onNext(v);
}
@java.lang.Override
public rx.Observable<java.io.File> call(java.io.File file) {
    return rx.Observable.from(file.listFiles());
}
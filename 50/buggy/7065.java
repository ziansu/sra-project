private com.github.kubatatami.judonetworking.observers.ObservableWrapper<T> connectAndNotify(com.github.kubatatami.judonetworking.observers.WrapperObserver<T> observer, com.github.kubatatami.judonetworking.observers.ObservableController controller) {
    return connect(observer, controller, true);
}
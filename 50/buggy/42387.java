public io.reactivex.Observable<net.bouzuya.blog.entity.Optional<java.lang.String>> observable() {
    return this.subject.distinctUntilChanged();
}
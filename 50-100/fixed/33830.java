@java.lang.Override
public rx.Observable<java.util.List<com.chenyu.monster.rxretrofithttprequest.Entity.Subject>> call(com.chenyu.monster.rxretrofithttprequest.framework.HttpResult<java.util.List<com.chenyu.monster.rxretrofithttprequest.Entity.Subject>> httpResult) {
    if ((httpResult.getCount()) == 0) {
        return rx.Observable.error(new com.chenyu.monster.rxretrofithttprequest.framework.ApiException(100));
    }else {
        return rx.Observable.just(httpResult.getSubjects());
    }
}
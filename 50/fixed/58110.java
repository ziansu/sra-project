public rx.Observable<com.insuranceline.data.remote.model.DashboardModel> getDashboardModel() {
    return rx.Observable.concat(getDashboardFromDb(), getDashboardFromApiWithSave()).repeatWhen(repeatWithDelay()).doOnNext(ifGoalAchievedFireEvent());
}
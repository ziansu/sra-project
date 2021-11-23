public rx.Observable<li.vin.net.TimeSeries<li.vin.net.Dtc>> dtcs(@android.support.annotation.Nullable
@retrofit2.http.Query(value = "since")
java.lang.Long since, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "until")
java.lang.Long until, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "limit")
java.lang.Integer limit, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "sortDir")
java.lang.String sortDir, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "state")
java.lang.String state) {
    return li.vin.net.Vinli.curApp().diagnostics().codes(this.id(), since, until, limit, sortDir, state);
}
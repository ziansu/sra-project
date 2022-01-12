@android.support.annotation.Nullable
public android.os.Bundle onProvideTransientParamsImpl(@android.support.annotation.NonNull
V v, @android.support.annotation.NonNull
android.view.View view, @android.support.annotation.Nullable
android.os.Bundle params) {
    VP presenter = getPresenter(v, false);
    allowScreenViewCalls = true;
    android.os.Bundle b = v.onProvideParams(view, params);
    if (b != null)
        params = b;
    
    allowScreenViewCalls = false;
    if (presenter != null) {
        b = presenter.onProvideTransientParams(v, view, params);
        if (b != null)
            params = b;
        
    }
    return params;
}
@com.facebook.react.uimanager.annotations.ReactProp(name = "nativeBackgroundAndroid")
public void setNativeBackground(com.facebook.react.views.view.ReactViewGroup view, @javax.annotation.Nullable
com.facebook.react.bridge.ReadableMap bg) {
    view.setTranslucentBackgroundDrawable((bg == null ? null : com.facebook.react.views.view.ReactDrawableHelper.createDrawableFromJSDescription(view.getContext(), bg)));
}
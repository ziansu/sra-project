@jsinterop.annotations.JsIgnore
public webmattr.dom.HTMLProps<T> set(java.lang.String name, java.lang.String value) {
    if (value != null) {
        webmattr.Reflection.set(this, name, value);
    }
    return this;
}
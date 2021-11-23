@java.lang.Override
public void setIcon(final android.graphics.drawable.Drawable icon) {
    com.afollestad.aesthetic.Aesthetic.get().colorIconTitle(null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).take(1).subscribe(new io.reactivex.functions.Consumer<com.afollestad.aesthetic.ActiveInactiveColors>() {
        @java.lang.Override
        public void accept(@io.reactivex.annotations.NonNull
        com.afollestad.aesthetic.ActiveInactiveColors colors) {
            setIcon(icon, colors.toEnabledSl());
        }
    }, com.afollestad.aesthetic.Rx.onErrorLogAndRethrow());
}
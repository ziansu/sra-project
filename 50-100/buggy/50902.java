@android.support.annotation.VisibleForTesting
rx.Observable<java.lang.String> getAddItemInputObservable(android.content.Context context) {
    return com.jakewharton.rxbinding.widget.RxTextView.afterTextChangeEvents(input).compose(((com.trello.rxlifecycle.components.support.RxAppCompatActivity) (context)).<com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEvent>bindToLifecycle()).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).map(new rx.functions.Func1<com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEvent, java.lang.String>() {
        @java.lang.Override
        public java.lang.String call(com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEvent event) {
            return sanitizeItemName(event.editable().toString());
        }
    }).debounce(net.jonmiranda.pantry.PantryAdapter.PantryAddItemViewHolder.ITEM_INPUT_WAIT_TIME_MS, java.util.concurrent.TimeUnit.MILLISECONDS, rx.android.schedulers.AndroidSchedulers.mainThread());
}
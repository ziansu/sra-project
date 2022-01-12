public rx.Observable<com.github.sonerik.rxexoplayer.RxExoPlayer.PlayerEvent> restart() {
    return seekTo(0).concatMap(new rx.functions.Func1<com.github.sonerik.rxexoplayer.RxExoPlayer.PlayerEvent, rx.Observable<com.github.sonerik.rxexoplayer.RxExoPlayer.PlayerEvent>>() {
        @java.lang.Override
        public rx.Observable<com.github.sonerik.rxexoplayer.RxExoPlayer.PlayerEvent> call(com.github.sonerik.rxexoplayer.RxExoPlayer.PlayerEvent event) {
            return start();
        }
    }).take(1);
}
@java.lang.Override
protected void onPostExecute(@android.support.annotation.NonNull
final java8.util.Optional<com.lima2017.neuralguide.api.ImageCaptionResult> result) {
    _listener.onImageCaptioned(result.get());
}
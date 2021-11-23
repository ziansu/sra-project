public static void startLine(@android.support.annotation.NonNull
final android.view.inputmethod.EditorInfo attribute, final boolean logBuffer) {
    if ((com.radicalninja.logger.LogManager.instance) != null) {
        com.radicalninja.logger.LogManager.instance.startNewLine(attribute, logBuffer);
    }
}
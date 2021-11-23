@java.lang.Override
public void run() {
    try {
        textarea.removeAllLineHighlights();
        sketch.prepare();
        sketch.build(verbose, saveHex);
        statusNotice(processing.app.I18n.tr("Done compiling."));
    } catch (processing.app.helpers.PreferencesMapException e) {
        statusError(processing.app.I18n.format(processing.app.I18n.tr("Error while compiling: missing '{0}' configuration parameter"), e.getMessage()));
    } catch (java.lang.Exception e) {
        status.unprogress();
        statusError(e);
    }
    status.unprogress();
    toolbar.deactivateRun();
}
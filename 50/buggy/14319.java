public void run() {
    runtime.launch(null);
    if (launchInteractive) {
        editor.initEditorCode(parser.allHandles, false);
        editor.stopTweakMode(parser.allHandles);
    }
}
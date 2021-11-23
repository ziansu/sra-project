private void Initialize() {
    android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.RECORD_AUDIO }, 1);
    final ai.api.android.AIConfiguration config = new ai.api.android.AIConfiguration("447b26a535ac45dfb92cda0b912da59d", ai.api.AIConfiguration.SupportedLanguages.English, AIConfiguration.RecognitionEngine.System);
    this.AIService = AIService.getService(this, config);
    this.AIService.setListener(this);
    this.ListenButton = ((android.widget.Button) (findViewById(R.id.startListeningButton)));
    this.StatusTextView = ((android.widget.TextView) (findViewById(R.id.virtualAssistantStatus)));
}
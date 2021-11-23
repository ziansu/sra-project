@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    MusicGenerator gen = new MusicGenerator();
    history.addItem(gen);
    tempOut.setText(java.lang.String.valueOf(gen.getTempo()));
    NoteOut.setText(gen.getNote());
    TimeSignatureOut.setText(gen.getTimeSignature().toString());
    ScaleOut.setText(gen.getScale());
    Application.logger.info(gen.toString());
}
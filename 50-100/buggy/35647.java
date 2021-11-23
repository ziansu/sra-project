@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    com.example.ffrae_000.memo.AudioMemo m = new com.example.ffrae_000.memo.AudioMemo(memos.size(), input.getText().toString());
    m.setFileDir(appFolder.getPath());
    memos.add(memos.size(), m);
    java.io.File temp = aR.getOutFile();
    com.example.ffrae_000.memo.Utilities.moveFile(temp, m.getData());
    saveAll();
    buildLayout();
    playMemo(m);
    return null;
}
@java.lang.Override
public void onStartInputView(android.view.inputmethod.EditorInfo info, boolean restarting) {
    super.onStartInputView(info, restarting);
    if (restarting) {
        learnWord(new me.blog.hgl1002.lboard.engine.Word(currentWord, null), start, true);
        previousWord = currentWord;
        resetComposing();
        updateInput();
        start = true;
    }else {
        resetComposing();
        chain = new me.blog.hgl1002.lboard.engine.WordChain(new me.blog.hgl1002.lboard.engine.Word[]{ me.blog.hgl1002.lboard.engine.WordChain.START , me.blog.hgl1002.lboard.engine.WordChain.START , me.blog.hgl1002.lboard.engine.WordChain.START });
        currentWord = "";
        previousWord = "";
    }
    updateCandidates();
}
@java.lang.Override
public com.phikal.regex.Utils.Task genTask(int lvl) throws com.phikal.regex.Games.TaskGenerationException {
    try {
        return super.genTask(lvl);
    } catch (java.lang.Exception e) {
        throw new com.phikal.regex.Games.TaskGenerationException(ctx.getString(R.string.word_error));
    }
}
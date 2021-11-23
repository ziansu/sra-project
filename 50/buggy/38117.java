@java.lang.Override
public java.lang.Void apply(@org.jetbrains.annotations.Nullable
java.lang.Void aVoid) {
    pomodoro += 1;
    if (loop)
        shortBreak();
    
    notifyFinish();
    return null;
}
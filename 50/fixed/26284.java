@java.lang.Override
public mathnstuff.symbolic.Expression reduce() {
    return new mathnstuff.symbolic.ExDiv(top.reduce(), bot.reduce());
}
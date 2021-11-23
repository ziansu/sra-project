@java.lang.Override
public void init(android.content.Context context, boolean bought) {
    game = new breathing.philipps.apps.com.breathing.BreathingOption(context);
    options = new breathing.philipps.apps.com.breathing.BreathingGame(context);
    this.bought = bought;
}
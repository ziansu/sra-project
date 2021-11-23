@java.lang.Override
public game.Reaction getUserReaction() {
    int choice = java.lang.Math.abs(((rand.nextInt()) % (reactions.size())));
    return reactions.get(choice);
}
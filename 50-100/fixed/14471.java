@java.lang.Override
public void opponentAction(kalah.agent.BoardState state, kalah.agent.Action action) {
    try {
        if (action instanceof kalah.agent.SwapAction)
            speaker.say(new kalah.agent.SwapCommandMessage());
        else {
            speaker.say(new kalah.agent.MoveCommandMessage(action));
            listener.next();
        }
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(("Speaker broke! " + e));
    }
}
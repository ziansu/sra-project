public void doAction(final magic.model.MagicPermanent permanent) {
    game.doAction(new magic.model.action.SacrificeAction(permanent));
    game.doAction(magic.model.action.ChangeStateAction.Set(event.getPermanent(), MagicPermanentState.Exploit));
}
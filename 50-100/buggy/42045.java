RemoteModelObject.Player generateRemoteObject() {
    ca.fa.frontier.server.RemoteModelObject.Player rmop = new ca.fa.frontier.server.RemoteModelObject.Player();
    rmop.name = name;
    rmop.points = points;
    rmop.resources = bank.sum();
    rmop.cards = cards.sum();
    rmop.soldier = soldier;
    rmop.chat = null;
    rmop.road = road;
    rmop.foreground = foreground;
    return rmop;
}
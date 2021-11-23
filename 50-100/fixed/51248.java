@java.lang.Override
public void onMessage(sir.barchable.clash.protocol.Message message) {
    switch (message.getType()) {
        case EnemyHomeData :
            setup(message.getMessage("resources"));
            break;
        case OwnHomeData :
            summarize(message.getMessage("resources"));
            break;
        case EndClientTurn :
            accumulateCost(message.getArray("commands"));
            break;
    }
}
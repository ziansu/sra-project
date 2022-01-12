public HAOutboundProto.Action.Verb convertVerb(com.hearthsim.util.HearthAction.Verb verb) {
    switch (verb) {
        case USE_CARD :
            return HAOutboundProto.Action.Verb.USE_CARD;
        case HERO_ABILITY :
            return HAOutboundProto.Action.Verb.HERO_ABILITY;
        case ATTACK :
            return HAOutboundProto.Action.Verb.ATTACK;
        case UNTARGETABLE_BATTLECRY :
            return HAOutboundProto.Action.Verb.UNTARGETABLE_BATTLECRY;
        case TARGETABLE_BATTLECRY :
            return HAOutboundProto.Action.Verb.TARGETABLE_BATTLECRY;
        case START_TURN :
            return HAOutboundProto.Action.Verb.START_TURN;
        case END_TURN :
            return HAOutboundProto.Action.Verb.END_TURN;
        case DO_NOT_USE_CARD :
            return HAOutboundProto.Action.Verb.DO_NOT_USE_CARD;
        case DO_NOT_ATTACK :
            return HAOutboundProto.Action.Verb.DO_NOT_ATTACK;
        case DO_NOT_USE_HEROPOWER :
            return HAOutboundProto.Action.Verb.DO_NOT_USE_HEROPOWER;
        case RNG :
            return HAOutboundProto.Action.Verb.RNG;
        case DRAW_CARDS :
            return HAOutboundProto.Action.Verb.DRAW_CARDS;
        default :
            return HAOutboundProto.Action.Verb.RNG;
    }
}
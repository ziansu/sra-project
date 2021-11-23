public MinionProto.Minion.Tribe convertTribe(com.hearthsim.card.minion.Minion.MinionTribe tribe) {
    switch (tribe) {
        case NONE :
            return MinionProto.Minion.Tribe.NONE;
        case BEAST :
            return MinionProto.Minion.Tribe.BEAST;
        case MECH :
            return MinionProto.Minion.Tribe.MECH;
        case MURLOC :
            return MinionProto.Minion.Tribe.MURLOC;
        case PIRATE :
            return MinionProto.Minion.Tribe.PIRATE;
        case DEMON :
            return MinionProto.Minion.Tribe.DEMON;
        case DRAGON :
            return MinionProto.Minion.Tribe.DRAGON;
        case TOTEM :
            return MinionProto.Minion.Tribe.TOTEM;
    }
    return MinionProto.Minion.Tribe.NONE;
}
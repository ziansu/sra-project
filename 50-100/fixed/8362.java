public com.hearthsim.card.CharacterIndex convertCharIndex(com.hearthsim.card.CharacterIndex index) {
    switch (index) {
        case HERO :
            return com.hearthsim.card.CharacterIndex.HERO;
        case MINION_1 :
            return com.hearthsim.card.CharacterIndex.MINION_1;
        case MINION_2 :
            return com.hearthsim.card.CharacterIndex.MINION_2;
        case MINION_3 :
            return com.hearthsim.card.CharacterIndex.MINION_3;
        case MINION_4 :
            return com.hearthsim.card.CharacterIndex.MINION_4;
        case MINION_5 :
            return com.hearthsim.card.CharacterIndex.MINION_5;
        case MINION_6 :
            return com.hearthsim.card.CharacterIndex.MINION_6;
        case MINION_7 :
            return com.hearthsim.card.CharacterIndex.MINION_7;
        case MINION_8 :
            return com.hearthsim.card.CharacterIndex.MINION_8;
        case MINION_9 :
            return com.hearthsim.card.CharacterIndex.MINION_9;
        case UNKNOWN :
            return com.hearthsim.card.CharacterIndex.UNKNOWN;
    }
    return com.hearthsim.card.CharacterIndex.UNKNOWN;
}
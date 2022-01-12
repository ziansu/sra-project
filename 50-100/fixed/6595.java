public static com.neikeq.kicksemu.game.inventory.Expiration fromInt(int value) {
    switch (value) {
        case 9200007 :
        case 9201007 :
            return com.neikeq.kicksemu.game.inventory.Expiration.DAYS_7;
        case 9200030 :
        case 9201030 :
            return com.neikeq.kicksemu.game.inventory.Expiration.DAYS_30;
        case 9200999 :
        case 9201999 :
            return com.neikeq.kicksemu.game.inventory.Expiration.DAYS_PERM;
        case 9101010 :
            return com.neikeq.kicksemu.game.inventory.Expiration.USAGE_10;
        case 9101050 :
            return com.neikeq.kicksemu.game.inventory.Expiration.USAGE_50;
        case 9101100 :
            return com.neikeq.kicksemu.game.inventory.Expiration.USAGE_100;
        default :
            return null;
    }
}
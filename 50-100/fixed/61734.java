public com.seanModTest.templates.BuildBlockData getFineOrDamagedBBD(java.util.Random rand, com.seanModTest.templates.BuildBlockData bbd, java.lang.String type) {
    if (!(damagedBlockChances.containsKey(type)))
        return bbd;
    else {
        float damageChance = damagedBlockChances.get(type);
        float f = rand.nextFloat();
        if (f < damageChance)
            return getRandomBBData(rand, ("d_" + type));
        else
            return bbd;
        
    }
}
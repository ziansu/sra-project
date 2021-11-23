public com.seanModTest.templates.BuildBlockData getFineOrDamagedBBD(java.util.Random rand, com.seanModTest.templates.BuildBlockData bbd) {
    if (!(damagedBlockChances.containsKey(bbd.getBlockName())))
        return bbd;
    else {
        float damageChance = damagedBlockChances.get(bbd.getBlockName());
        float f = rand.nextFloat();
        if (f < damageChance)
            return getRandomBBData(rand, ("d_" + (bbd.getBlockName())));
        else
            return bbd;
        
    }
}
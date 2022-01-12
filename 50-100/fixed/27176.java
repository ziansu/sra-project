public static void initiate() {
    evra.EvraMain.dbs = new java.util.ArrayList<evra.Database>();
    evra.EvraMain.dbs.add(new evra.Database("spells"));
    evra.EvraMain.dbs.add(new evra.Database("items"));
    evra.EvraMain.dbs.add(new evra.Database("monsters"));
    evra.EvraMain.initiated = true;
}
public static java.util.EnumSet<joH1.oo_rpg.Stat> splitSet(int stats) {
    java.util.EnumSet<joH1.oo_rpg.Stat> s = java.util.EnumSet.noneOf(joH1.oo_rpg.Stat.class);
    for (joH1.oo_rpg.Stat stat : joH1.oo_rpg.Stat.values())
        if ((stats & (stat.value)) != 0)
            s.add(stat);
        
    
    return s;
}
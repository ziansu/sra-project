public static java.util.ArrayList<joH1.oo_rpg.Stat> splitList(int stats) {
    java.util.ArrayList<joH1.oo_rpg.Stat> l = new java.util.ArrayList<joH1.oo_rpg.Stat>(6);
    for (joH1.oo_rpg.Stat stat : joH1.oo_rpg.Stat.values())
        if ((stats & (stat.value)) != 0)
            l.add(stat);
        
    
    l.trimToSize();
    return l;
}
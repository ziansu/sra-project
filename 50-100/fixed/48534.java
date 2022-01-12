@java.lang.Override
public void replace(org.lodder.subtools.sublibrary.model.Release release, java.util.Map<java.lang.String, java.lang.Integer> weights) {
    java.lang.String reservedKey = "%GROUP%";
    if (!(weights.containsKey(reservedKey)))
        return ;
    
    int weight = weights.get(reservedKey);
    weights.remove(reservedKey);
    java.lang.String group = release.getReleasegroup().toLowerCase();
    weights.put(group, weight);
}
@java.lang.Override
public boolean containsAmount(java.util.List combined) {
    int numContained = 0;
    for (int i = 0; i < (combined.size()); i += 2)
        numContained += (containsAmount(((com.auramcraft.api.Auras) (combined.get(i))), ((java.lang.Integer) (combined.get((i + 1)))))) ? 1 : 0;
    
    return numContained == ((auras.size()) / 2);
}
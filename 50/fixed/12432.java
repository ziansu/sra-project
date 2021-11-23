@java.lang.Override
public com.badlogic.neogenesis.Food beBitten() {
    if ((biomass) <= 1) {
        return beDigested();
    }
    biomass -= 1;
    return new com.badlogic.neogenesis.Food(10, 1);
}
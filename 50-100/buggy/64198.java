@org.jetbrains.annotations.NotNull
private java.lang.String generateArmeWithProprieteSpeciale(java.lang.String puissance, generator.controller.Arme arme) {
    generator.controller.ArmeBonus armeBonus;
    java.util.List<generator.controller.ProprieteSpeciale> proprieteSpeciales = proprieteSpecialeController.generateProprieteSpecialeArme(puissance, arme);
    int totalBonus = proprieteSpeciales.stream().mapToInt(ProprieteSpeciale::getModificateur).sum();
    armeBonus = armeBonusRepository.findFirstByBonus(java.lang.String.valueOf(totalBonus));
    return ((((arme.getArme()) + " (") + (arme.getPrix())) + (armeBonus.getPrixBase())) + "po)";
}
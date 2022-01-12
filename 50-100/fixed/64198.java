@org.jetbrains.annotations.NotNull
private java.lang.String generateArmeWithProprieteSpeciale(java.lang.String puissance, generator.controller.Arme arme) {
    java.util.List<generator.controller.ProprieteSpeciale> proprieteSpeciales = proprieteSpecialeController.generateProprieteSpecialeArme(puissance, arme);
    int totalBonus = proprieteSpeciales.stream().mapToInt(ProprieteSpeciale::getModificateur).sum();
    generator.controller.ArmeBonus armeBonus = armeBonusRepository.findFirstByBonus(java.lang.String.valueOf(totalBonus));
    return ((((arme.getArme()) + " (") + (arme.getPrix())) + (armeBonus.getPrixBase())) + "po)";
}
public static void chainArmor() {
    Gear.aRat[1] = 8;
    if ((Gear.aRat[1]) > (Gear.mw.soak)) {
        Gear.mw.armorName = "Chain Armor";
        Gear.mw.soak = 8;
        java.lang.System.out.println("You found Chain Armor");
    }
}
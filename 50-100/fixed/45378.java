public java.lang.String usePotion() {
    Item potionPouch = inventory.get(0);
    int potionAmt = ((java.lang.Integer) (potionPouch.getItemAttribute("AMOUNT"))).intValue();
    if (potionAmt > 0) {
        potionPouch.setItemAttribute("AMOUNT", new java.lang.Integer((potionAmt - 1)));
        addHealth(((java.lang.Integer) (potionPouch.getItemAttribute("HEALTH_POINTS"))).intValue());
        return "Consumed 1 potion.";
    }else
        return "No potions!";
    
}
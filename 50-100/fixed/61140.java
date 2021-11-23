@java.lang.Override
protected void onMenuClick(java.lang.String menu) {
    if ((menu.equals("Nouvelle Partie")) && ((tailleMorpion) != 0)) {
        decalageX = ((decalageX) + (tailleMorpion)) % ((tailleMorpion) * 5);
        decalageY = ((decalageY) + (tailleMorpion)) % ((tailleMorpion) * 5);
    }else
        if (menu.equals("Quitter")) {
            os.startApp("Share");
        }
    
}
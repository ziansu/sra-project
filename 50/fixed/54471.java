public void destroy(cardgame.Enchantment c) {
    if (c.remove())
        enchantments.remove(c);
    
}
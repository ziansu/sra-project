private void readAll() {
    tryItemMeta();
    java.util.List<java.lang.String> itemLore = itemStack.getItemMeta().getLore();
    itemLore = (itemLore == null) ? new java.util.ArrayList<java.lang.String>() : itemLore;
    this.lore = itemLore;
    for (java.lang.String line : itemLore) {
        java.util.Map.Entry<java.lang.String, java.lang.Object> entry = toEntry(line);
        this.values.put(entry.getKey(), entry.getValue());
    }
}
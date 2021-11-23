private org.bukkit.Color getColor() {
    org.bukkit.Color c = null;
    int i = random.nextInt(17);
    org.bukkit.Color[] listOfColors = new org.bukkit.Color[]{ org.bukkit.Color.AQUA , org.bukkit.Color.BLACK , org.bukkit.Color.BLUE , org.bukkit.Color.FUCHSIA , org.bukkit.Color.GREEN , org.bukkit.Color.GRAY , org.bukkit.Color.LIME , org.bukkit.Color.MAROON , org.bukkit.Color.NAVY , org.bukkit.Color.OLIVE , org.bukkit.Color.ORANGE , org.bukkit.Color.PURPLE , org.bukkit.Color.RED , org.bukkit.Color.SILVER , org.bukkit.Color.TEAL , org.bukkit.Color.WHITE , org.bukkit.Color.YELLOW };
    c = listOfColors[i];
    return c;
}
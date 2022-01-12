private com.amulyakhare.textdrawable.TextDrawable getDrawable(com.codepath.model.Item item) {
    com.amulyakhare.textdrawable.util.ColorGenerator generator = com.amulyakhare.textdrawable.util.ColorGenerator.MATERIAL;
    int color = generator.getColor(item.name);
    com.amulyakhare.textdrawable.TextDrawable.IBuilder builder = com.amulyakhare.textdrawable.TextDrawable.builder().beginConfig().withBorder(5).endConfig().round();
    java.lang.String firstLetterStr = "" + (item.name.toUpperCase().charAt(0));
    return builder.build(firstLetterStr, color);
}
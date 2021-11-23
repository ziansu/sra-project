public java.util.List<javafx.scene.Node> fromGems(final int value) {
    final java.util.List<javafx.scene.Node> result = new java.util.ArrayList<>();
    labelsForCurrency(com.bouye.gw2.sab.text.LabelUtils.CurrencyType.GEM, value, result);
    return java.util.Collections.unmodifiableList(result);
}
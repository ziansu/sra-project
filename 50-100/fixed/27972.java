protected javafx.scene.control.Skin<?> createDefaultSkin() {
    dependencies.material_components.IconButtonSkin skin = new dependencies.material_components.IconButtonSkin(this);
    if ((icon) != null) {
        skin.setIcon(icon);
    }
    if ((iconBackground) != null) {
        skin.setIcon(iconBackground);
        iconBackground.setVisible(false);
    }
    dependencies.material_components.utils.RippleSkinFactory.getRippleEffect(skin, this);
    return skin;
}
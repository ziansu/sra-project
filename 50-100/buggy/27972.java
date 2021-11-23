protected javafx.scene.control.Skin<?> createDefaultSkin() {
    dependencies.material_components.IconButtonSkin skin = new dependencies.material_components.IconButtonSkin(this);
    skin.setIcon(icon);
    skin.setIcon(iconBackground);
    iconBackground.setVisible(false);
    dependencies.material_components.utils.RippleSkinFactory.getRippleEffect(skin, this);
    return skin;
}